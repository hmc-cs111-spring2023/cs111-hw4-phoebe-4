###### What is easy to do in Scala? What's not?
Easy:
- String concatenation
    - Strings can be added to other strings, and strings can be concatenated from a List form.
- Type checking/aliasing
    - I love static typing - especially when running Scala in codespaces can cause issues. I also find it cool that you can name a custom type (ex. Color, Board in Mastermind) and I can see how this would help with  readability of objects in domain-specific programs.

Hard:
- List indexing
    - I assumed "apply" does some sort of transform to the list, and only realized apply meant get element by index when I stumbled upon the shorthand for indexing in Mastermind.


###### So far, what is/are your favorite language design choice(s) that the designers of Scala made? Why?
- lack of end-line semicolons
    - Semicolon delimiters in Java often cause problems and they don't seem to do much to the readability of Java code. I presume the designers have had Java experience and found similar gripes with some of Java's arbitrary delimiters.
- for loop readability
    - I think the arrow notation is a really nice balance between natural language and lack of readability. We have discussed at length in earlier homeworks about tradeoffs between natural language and abstract notation. An arrowhead implies a direction, and "until" is indicative of stopping before the final number/condition.
- annotations
    - The only annotation in this homework so far is main, but I like the idea of annotations because they make for cleaner ways of adding metadata to functions. To take the example of main, the signature of Java's main function can feel arbitrary. Having main as an annotation implies that the function is similar to any other - the only difference being that it is the entry point to the program.

###### So far, what is/are your least favorite language design choice(s)? Why? And why do you think the designers made that / those choice(s)?
- various syntax for making functions
    - The flexibility can make for more readable depending on the situation. Nonetheless, I think it can get confusing to read if there are too many different ways of indicating functions within a file - the visual cue of seeing "blocks" of methods gets lost.
- lack of jump statements (return, break, continue)
    - This is probably to encourage cleaner logic - by inducing the last statement to be the return, it implicitly enforces patterns of storing/calculating output. Break/continue is to stop some sort of loop, and the lack of conventional use for these keywords will encourage using Scala's many collection methods rather than custom loops. Nonetheless, the lack of keywords is confusing for me because I am used to Java and Python.

###### What Scala features would you like to learn more about?
- Exception handling
- Does Scala have any concept of packages (like packages in Java)?