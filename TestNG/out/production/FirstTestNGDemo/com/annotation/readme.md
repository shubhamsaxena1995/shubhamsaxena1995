First of all, beforeSuite() method is executed only once.

Lastly, the afterSuite() method executes only once.

Even the methods beforeTest(), beforeClass(), afterClass(), and afterTest() methods are executed only once.

beforeMethod() method executes for each test case but before executing the test case.

afterMethod() method executes for each test case but after executing the test case.

In between beforeMethod() and afterMethod(), each test case executes.