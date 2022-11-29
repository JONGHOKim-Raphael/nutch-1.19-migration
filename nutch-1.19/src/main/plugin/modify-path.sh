#!/bin/bash

PLUGIN_PATH=`dirname $0`

WRONG_EXP1="file=\"..\/..\/..\/ivy\/ivy-configurations.xml\""
WRONG_EXP2="file=\"..\/..\/..\/\/ivy\/ivy-configurations.xml\""
CORRECT_EXP="file=\"..\/..\/..\/..\/ivy\/ivy-configurations.xml\""


for ivyfile in ${PLUGIN_PATH}/*/ivy.xml; do
    sed -i "s/${WRONG_EXP1}/${CORRECT_EXP}/g" ${ivyfile}
    sed -i "s/${WRONG_EXP2}/${CORRECT_EXP}/g" ${ivyfile}
done
