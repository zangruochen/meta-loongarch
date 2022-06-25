# meta-loongarch

Yocto BSP layer for Loongarch

## Quick links

* Git repository web frontend:
  <https://github.com/zangruochen/meta-loongarch.git>
* Issues management (Github Issues):
  <https://github.com/zangruochen/meta-loongarch/issues>

## Description

This is the general hardware specific BSP overlay for the Loongarch device.

## Dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky
  * branch: master
  * revision: HEAD

## Quick Start

1. source poky/oe-init-build-env build-LA
2. Add this layer to bblayers.conf and the dependencies above
3. Set MACHINE in local.conf to one of the supported boards
4. bitbake core-image-base

## Maintainers

* Zang Ruochen `<zangruochen@loongson.cn>`
