/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.castlemock.core.mock.rest.service.project.output;

import com.castlemock.core.basis.model.Output;
import com.castlemock.core.basis.model.validation.NotNull;
import com.castlemock.core.mock.rest.model.project.domain.RestProject;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public final class UpdateRestProjectOutput implements Output {

    @NotNull
    private final RestProject updatedRestProject;

    private UpdateRestProjectOutput(RestProject updatedRestProject) {
        this.updatedRestProject = updatedRestProject;
    }

    public RestProject getUpdatedRestProject() {
        return updatedRestProject;
    }


    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {

        private RestProject updatedRestProject;

        public Builder updatedRestProject(final RestProject updatedRestProject){
            this.updatedRestProject = updatedRestProject;
            return this;
        }

        public UpdateRestProjectOutput build(){
            return new UpdateRestProjectOutput(this.updatedRestProject);
        }

    }
}
