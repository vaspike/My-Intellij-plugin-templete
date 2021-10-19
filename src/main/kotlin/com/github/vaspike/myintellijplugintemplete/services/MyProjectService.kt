package com.github.vaspike.myintellijplugintemplete.services

import com.intellij.openapi.project.Project
import com.github.vaspike.myintellijplugintemplete.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
