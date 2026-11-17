package com.example.shopkt.billing

import org.springframework.modulith.ApplicationModule

@ApplicationModule(allowedDependencies = ["stock :: a", "stock :: events"])
internal object ModuleMetadata
