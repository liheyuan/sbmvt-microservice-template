#!/bin/bash
./gradlew cleanArch 
./gradlew generate -Dcom.orctom.gradle.archetype.binding.CamelName=SbmvtAbc -Dcom.orctom.gradle.archetype.binding.camelName=sbmvtAbc -i
