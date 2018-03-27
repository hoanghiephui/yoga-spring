package com.yoga.api.repository

import com.yoga.api.entiry.Level
import org.springframework.data.repository.CrudRepository

interface LevelRepository : CrudRepository<Level, Int> {

}