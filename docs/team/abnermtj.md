# Tolentino Abner Jr Morales Project Portfolio Page 

## Overview
CheatLogs is a free and open-source cheatsheet manager with blazing fast organization, editing, and searching via a command-line interface (CLI) and graphical user interface (GUI). 

Written in Java and has about 5000 Lines of Code (LoC).

### Summary of Contributions
#### Code Contributed

[Reference for code ](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=abnermtj&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=abnermtj&tabRepo=AY2021S1-CS2113T-W11-3%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code)

---
#### Features/Enhancements Implemented
I was in charge of the classes: **Command** , **Parser**, **UserSesssion**, **UI** , **ConsoleColors**, **ClearCommand**, **DeleteCommand**, **EditCommand**, **ExitCommand**, **HelpCommand**

I will go through mainly the **Parser**, **Command**, and **UserSession** and **ConsoleColors** classes to make this not too long.
##### Parser class
This class parses the user input to construct a Command object that can be executed at a later time. It performs input validation to prevent exceptions. This class also was improved to prompt for the user input in the case that he missed some of the required flags.	This was particularly tricky because there are so many possible ways input can go wrong and had to be constantly adjusted throughout the project.

##### Command class
Acts as the base class for all commands, which follow the command pattern and encapsulate and the necessary information it needs to execute. After many iterations, it now uses dependency injections given by the parser class to make the code less coupled and the gave the ability to use stubs when testing.

I made it such that each command specifies the flags that it wants. Before, the flags required by a command was written in the parser. Now instead of that, the parser is able to retrieve the required flags from a specific command which further decreases the coupling of code.

##### UserSession class 
This class is where the initialization, termination, and main loop of the program runs. Because we used dependency injection as mentioned before, we at one point no longer had to use statics and singletons. All common objects shared by the different commands are now singly instanced in the constructor of this class. This was great to further reduce coupling and ease of testing.

##### ConsoleColors class
To improve the visuals of our program, the use of color-coding our output was suggested and I looked intro creating basic coloring using ANSI escape characters. This significantly boosted the legibility of the program.

---
#### Contributions to Documentation
I contributed to the document by creating the general formatting as well as most of the images throughout the entire document, later was assigned **section 4.2** which covers `/edit` and `/fav`  commands.

---
#### Contributions to the DG

I contributed to **section 4.1** **section 4.2.1** **section 5.1** and **section 7.3** which covers the `Architecture`, `UserInterface`.  `Parsing of Data to Construct Commands` and the `Use cases`

---

#### Contribution to team-based tasks
- Created issues on the [Github issue tracker](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues?q=is%3Aissue+author%3Aabnermtj) and assigned them to various people on GitHub to highlight potential issues to my colleagues.
- Did a lot of the major formatting of the user guide as well as many of the images in most of the sections. 
- Suggesting potential improvements to my teammates' parts.

---
#### Review/Mentoring Contributions
I reviewed some PRs both to my colleagues and the other groups in the Dry Run Practical Exam. I gave both suggestions to improve their code both via GitHub PR review and as well as acknowledging their effort when I see great code.

Here are some examples of PRs I reviewed:
- [#36](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/36#discussion_r503042388)
- [#84](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/84#discussion_r511032897)
- [#21](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/21)
---
