from ASTGenerator import ASTGenerator

PREFIX = "ast"

def build_test(name, source):
    expected = str(ASTGenerator(source).generate())

    return f'''
def test_{PREFIX}_{name}():
    source = """{source}"""
    expected = "{expected}"
    assert str(ASTGenerator(source).generate()) == expected
'''

tests = []

# ----------------
# EXPRESSIONS
# ----------------

expr_sources = [
"""
int main() {
    return 1 + 2;
}
""",
"""
int main() {
    return 3 - 1;
}
""",
"""
int main() {
    return 2 * 5;
}
""",
"""
int main() {
    return 8 / 4;
}
""",
"""
int main() {
    return (1 + 2) * 3;
}
""",
"""
int main() {
    return 1 + 2 * 3;
}
""",
"""
int main() {
    return (1 + 2) + (3 + 4);
}
""",
"""
int main() {
    return (1 + (2 + 3));
}
"""
]

i = 1
for n in range(75):
    for j in range(2):
        src = expr_sources[(n+j) % len(expr_sources)]
        tests.append(build_test(f"exp_{i:03}", src))
        i += 1


# ----------------
# STATEMENTS
# ----------------

stmt_sources = [
"""
void main() {
    return;
}
""",
"""
void main() {
    auto x = 5;
}
""",
"""
void main() {
    auto x = 1;
    auto y = 2;
}
""",
"""
void main() {
    auto x = 10;
    return;
}
""",
"""
void main() {
    auto a = 1;
    auto b = 2;
    auto c = 3;
}
"""
]

for n in range(50):
    for j in range(2):
        src = stmt_sources[(n+j) % len(stmt_sources)]
        tests.append(build_test(f"stmt_{i:03}", src))
        i += 1


# ----------------
# DECLARATIONS
# ----------------

decl_sources = [
"""
int x;
""",
"""
int x = 5;
""",
"""
struct Point {
    int x;
};
""",
"""
struct Pair {
    int a;
    int b;
};
"""
]

for n in range(20):
    for j in range(2):
        src = decl_sources[(n+j) % len(decl_sources)]
        tests.append(build_test(f"decl_{i:03}", src))
        i += 1


# ----------------
# INTEGRATION
# ----------------

integration_sources = [
"""
int add(int a, int b) {
    return a + b;
}
""",
"""
int main() {
    return 1 + 2;
}
""",
"""
struct Point {
    int x;
    int y;
};
""",
"""
void main() {
    auto x = 10;
}
"""
]

for n in range(5):
    for j in range(2):
        src = integration_sources[(n+j) % len(integration_sources)]
        tests.append(build_test(f"int_{i:03}", src))
        i += 1


# ----------------
# STRESS
# ----------------

stress_sources = [
"""
int main() {
    return (((1 + 2)));
}
""",
"""
int main() {
    return ((1 + 2) * (3 + 4));
}
""",
"""
int main() {
    return 1 + 2 + 3 + 4;
}
""",
"""
int main() {
    return (1 + (2 * (3 + 4)));
}
"""
]

for n in range(20):
    for j in range(2):
        src = stress_sources[(n+j) % len(stress_sources)]
        tests.append(build_test(f"stress_{i:03}", src))
        i += 1


with open("test_ast_generator.py", "w") as f:
    f.write("from ASTGenerator import ASTGenerator\n\n")
    for t in tests:
        f.write(t)

print("✅ Generated 340 AST tests in test_ast_generator.py")
