/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.netflix.spinnaker.testing.scenarios

import com.netflix.spinnaker.testing.api.TaskResult

interface Scenario {
    fun plan() : List<ScenarioActivity>
}

data class ScenarioActivity(val secondsOffset : Int,
                            val job: Map<String, Any>,
                            val scenarioName: String,
                            val application: String,
                            val description: String) {
  var taskResult : TaskResult? = null
  var taskId : String? = null
}
