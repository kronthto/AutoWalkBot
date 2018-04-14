# Auto-Walk-Bot - Shift+W exhaustion

[![Software License][ico-license]](LICENSE.md)
[![Latest Stable Version][ico-githubversion]][link-releases]

This is a really simple app pressing the Shift & W keys. Can be useful to Auto-Run in certain games. Uses [`java.awt.Robot`](https://docs.oracle.com/javase/8/docs/api/java/awt/Robot.html#keyPress-int-).

Depends on [kristian/system-hook](https://github.com/kristian/system-hook) (for the hotkey) which might not work on every OS due to the native hook.

## Build

```bash
$ curl -OL https://github.com/kristian/system-hook/releases/download/3.2/system-hook-3.2.jar
$ mkdir build
$ CLASSPATH=./system-hook-3.2.jar javac -d ./build/ src/de/kronthto/autowalk/*.java
$ jar cfm AutoWalkBot.jar Manifest.txt -C build .
```

## Usage

```bash
$ java -jar AutoWalkBot.jar
```

Press F5 to toggle active/inactive.

## Credits

- [All Contributors][link-contributors]

## License

The MIT License (MIT). Please see the [License File](LICENSE.md) for more information.

[ico-license]: https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square
[ico-githubversion]: https://poser.pugx.org/kronthto/AutoWalkBot/v/stable

[link-releases]: https://github.com/kronthto/AutoWalkBot/releases
[link-contributors]: ../../contributors
