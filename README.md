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

1. Apply patch Add-loongarch-support.patch in poky
2. source poky/oe-init-build-env build-LA
3. Add this layer to bblayers.conf and the dependencies above

## Maintainers

* Zang Ruochen `<zangruochen@loongson.cn>`
