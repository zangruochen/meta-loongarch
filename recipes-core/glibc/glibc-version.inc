SRCBRANCH ?= "loongarch_2_34_dev_v2.0"
PV = "2.34"
SRCREV_glibc ?= "6611e514dce1ee372a5c38d6e7ecafceaaf1a194"
SRCREV_localedef ?= "794da69788cbf9bf57b59a852f9f11307663fa87"

GLIBC_GIT_URI ?= "git://github.com/loongson/glibc.git"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.(?!90)\d+)*)"
