# Hubertus Adhy Pratama Setiawan - Project Portfolio Page

## Overview
CheatLogs is a free and open-source cheatsheet manager with blazing fast organization, editing and searching via a command-line interface (CLI) and graphical user interface (GUI) . 

Written in Java (~5000 Lines of Code).

## Summary of Contributions
### Code Contributed

The link to the code I wrote can be found [here](https://nus-cs2113-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=adhy-p&sort=groupTitle&sortWithin=title&since=2020-09-27&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=adhy-p&tabRepo=AY2021S1-CS2113T-W11-3%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other).

---
### Features/Enhancements Implemented
I was in charge of the **CheatSheetList** class, **color-coding** of output, and **SettingsCommand** class.
#### 1. CheatSheetList class
CheatSheetList class maintains all the cheatsheets during runtime. The `getCheatSheet` method can be invoked both using `index` and `name` to give the user the liberty to choose the one they are more comfortable with. 

*Highlights*

Most of the time spent on CheatSheetList was on refactoring and changing the design aspect of this class. At first, the team decided to make this class non-static and pass it around to every other class. Then, we realized that there can only be one instance of this class and therefore it is reasonable to change it to static class. However, we decided to change it back to non-static to make this class easier to test and manage.
#### 2. Color-coding of output
I utilized ANSI escape codes to add colors to the output text. In addition, I utilized the JANSI library to allow these escape codes to be recognized by Windows cmd.

*Highlights*

To add a certain color to the text, I simply wrap the text with the appropriate escape codes. All the color coding are done inside the `printer` class, except for the `/list`, `/view` and `/find` commands. These command prints the cheatsheets in a table form for a more pleasant viewing using *String Formatter*. Unfortunately, the formatter is not compatible with the ANSI escape codes and it ended up breaking the table. Thus, I had to tweak the string formatter itself and integrate the color there instead of on the actual text.

#### 3. SettingsCommand class 
The `/set` command allows the user to modify the default behavior of the application. The user can change the default color scheme of the output and also choose to enable/disable the help messages found on each command. These settings are saved in a `txt` file. 

*Highlights*

The save data for settings is integrated to the storage class in a way such that it does not interfere with the storage of the cheatsheets. Settings and cheatsheets has their own parsers and file writers. 

---
### Contributions to Documentation
I contributed to **section 4.4**: 
- `/help` command
- `/set` command
- `/exit` command

---
### Contributions to the DG
I contributed to **section 4.2.3.1** and **section 4.2.3.10 - 4.2.3.12**:
- FinderCommand
- DeleteCommand
- ClearCommand
- FavouriteCommand
- HelpCommand

I also contributed to **section 5.5 - 5.6**, **section 10.2**, and **section 11**:
- Changing default settings
- Proposed color coding implementation
- User stories
- Instructions for manual testing

---
### Contribution to team-based tasks
- Created milestones on GitHub to make the planning and management of the project easier.
- Helped the team to maintain the [issue tracker](https://github.com/AY2021S1-CS2113T-W11-3/tp/issues?q=is%3Aissue+author%3Aadhy-p+).
- Helped the team to release the [product](https://github.com/AY2021S1-CS2113T-W11-3/tp/releases/tag/v2.0).
- Proofread the User Guide & Developer Guide and made necessary amendments.

---
### Review/Mentoring Contributions
I reviewed some PRs and gave suggestions to my colleagues on how to improve their code both via GitHub PR review and privately via personal chat.

Here are some examples of PRs I reviewed:
- [#36](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/36)
- [#42](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/42)
- [#91](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/91)
- [#192](https://github.com/AY2021S1-CS2113T-W11-3/tp/pull/192)
---
