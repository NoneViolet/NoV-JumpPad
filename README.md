# SpigotPluginTemplate
[![EasySpigotAPI](https://img.shields.io/badge/EasySpigotAPI-%E2%AC%85-4D4.svg)](https://github.com/sya-ri/EasySpigotAPI)

簡単にプラグインを作ることができる [EasySpigotAPI](https://github.com/sya-ri/EasySpigotAPI) の提供でお送りします。

> e.g. GitHub のユーザー名が `abcdef` で、作るプラグインの名前が `Sample` だったら
>
> ```kotlin
> package com.github.abcdef.sample
> ```

### [build.gradle.kts](build.gradle.kts)

```kotlin
configure<BukkitPluginDescription> {
    // ...
    main = "sample.Main" // TODO JavaPlugin を継承したクラスとパッケージを入力する
    // ...
}
```
> e.g. GitHub のユーザー名が `abcdef` で、作るプラグインの名前が `Sample` だったら
>
> ```kotlin
> configure<BukkitPluginDescription> {
>     // ...
>     main = "com.github.abcdef.sample.Main"
>     // ...
> }
> ```

### plugin.yml

[build.gradle.kts](build.gradle.kts) の中で設定できます。必要であれば設定しましょう。

```kotlin
configure<BukkitPluginDescription> {
    // plugin.yml の中身
}
```

## Gradle Task

### ktlintFormat
```
gradle ktlintFormat
```

ソースコードを綺麗にすることができます。

### addKtlintFormatGitPreCommitHook
```
gradle addKtlintFormatGitPreCommitHook
```

Git Commit する時に `ktlintFormat` を実行します。やっておくことで必ずフォーマットしてくれるようになるので忘れがちな人にオススメです。

### shadowJar
```
gradle shadowJar
```

Jar ファイルを生成します。`build/libs` フォルダの中に生成されます。