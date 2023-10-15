<body>
    <p th:utext="Hello, ${input}!" /> <!-- Noncompliant -->
    <p>Hello, [(${input})]!</p>       <!-- Noncompliant -->
</body>