scalaVersion := "2.12.5"

name := "ScalaLibPractice"

version := "0.0.1"

organization := "jp.bizen"

// library名に scalaのバージョンが入るのを防ぐ
crossPaths := false

val publishPath =
  "file://" + new java.io.File(".").getAbsolutePath + "/repositories"

publishTo := Some("Local Repo" at publishPath)
