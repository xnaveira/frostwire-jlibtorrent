#!/bin/bash

rm -rf objc/*

j2objc -sourcepath ../src/main/java -d objc \
    --doc-comments \
    --strip-reflection \
    --swift-friendly \
    -use-arc \
    --no-package-directories \
    --prefix com.frostwire.jlibtorrent= \
    --prefix com.frostwire.jlibtorrent.alerts= \
    --prefix com.frostwire.jlibtorrent.swig= \
    `find ../src/main/java/com/frostwire/jlibtorrent -name '*.java' | egrep -v "swig|alerts"`

j2objc -sourcepath ../src/main/java -d objc/alerts \
    --doc-comments \
    --strip-reflection \
    --swift-friendly \
    -use-arc \
    --no-package-directories \
    --prefix com.frostwire.jlibtorrent= \
    --prefix com.frostwire.jlibtorrent.alerts= \
    --prefix com.frostwire.jlibtorrent.swig= \
    `find ../src/main/java/com/frostwire/jlibtorrent/alerts -name '*.java'`

    j2objc -sourcepath ../src/main/java -d objc/swig \
    --doc-comments \
    --strip-reflection \
    --swift-friendly \
    -use-arc \
    --no-package-directories \
    --prefix com.frostwire.jlibtorrent= \
    --prefix com.frostwire.jlibtorrent.alerts= \
    --prefix com.frostwire.jlibtorrent.swig= \
    `find ../src/main/java/com/frostwire/jlibtorrent/swig -name '*.java'`
