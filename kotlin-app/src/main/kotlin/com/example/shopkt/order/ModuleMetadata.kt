package com.example.shopkt.order

import org.springframework.modulith.ApplicationModule

@ApplicationModule(allowedDependencies = ["stock :: b", "stock :: audit"])
internal object ModuleMetadata
