<template>
    <a-card :bordered="false" class="header-solid h-full mb-24" :style="{padding: '20px'}">
        <a-form :model="formState" :label-col="labelCol" :wrapper-col="wrapperCol">
            <a-row :gutter="24" type="flex">
                <a-col>
                    <a-form-item label="Attraction Name:"/>
                </a-col>
                <a-col>
                    <a-input placeholder="" />
                </a-col>
            </a-row>
            <a-card v-for="eachPass in dynamicValidateForm" :key="eachPass.key" :style="{'marginTop': '10px'}">
                <h6>{{ eachPass.value }}</h6>
                 <a-row :gutter="24" type="flex">
                    <a-col>
                        <a-form-item label="Pass ID:"/>
                    </a-col>
                    <a-col>
                        <a-input placeholder="" />
                    </a-col>
                </a-row>
                 <a-row :gutter="24" type="flex">
                    <a-col>
                        <a-form-item label="Pass Type:"/>
                    </a-col>
                    <a-col>
                        <a-input-group>
                            <a-select v-model="selected">
                                <a-select-option value="Physical Pass">Physical Pass </a-select-option>
                                <a-select-option value="E-Pass">E-Pass </a-select-option>
                            </a-select>
                        </a-input-group>
                    </a-col>
                </a-row>
                 <a-row :gutter="24" type="flex">
                    <a-col>
                        <a-form-item label="Number of Guests (including Staff):"/>
                    </a-col>
                    <a-col>
                        <a-input placeholder="" />
                    </a-col>
                </a-row>
                <a-row :gutter="24" type="flex">
                    <a-col>
                        <a-form-item label="Replacement Fee ($):"/>
                    </a-col>
                    <a-col>
                        <a-input placeholder="" />
                    </a-col>
                </a-row>
            </a-card>
            <a-row :gutter="24" type="flex" :style="{'marginTop': '20px', 'marginLeft': '5px'}">
                <a-button type="dashed" style="width: 20%" @click="addDomain">
                    <PlusOutlined />
                    Add Pass
                </a-button>
            </a-row>
            <a-row :gutter="24" type="flex" :style="{'marginTop': '20px'}">
                <a-col>
                    <a-form-item label="Email Template:"/>
                </a-col>
                <a-col>
                    <a-textarea placeholder="" :rows="4" />
                </a-col>
            </a-row>
             <a-row :gutter="24" type="flex" :style="{'marginTop': '20px'}">
                <a-col>
                    <a-form-item label="Authorisation Letter:"/>
                </a-col>
                <a-col>
                    <a-textarea placeholder="" :rows="4" />
                </a-col>
            </a-row>
            <a-row :gutter="24" type="flex" :style="{'marginTop': '50px', 'marginLeft': '5px'}">
                <a-form-item>
                    <a-button block html-type="submit" class="login-form-button" :style="{'background-color': '#0C41FF', 'color': 'white'}">
                        Create Attraction
                    </a-button>
                </a-form-item>
            </a-row>
        </a-form>
</a-card>
</template>

<script>

export default {
    methods: {
        addDomain() {
            console.log("Hello")
            this.dynamicValidateForm.push({
                key: this.count++, 
                value: "Pass" + this.count
            });
            console.log(this.dynamicValidateForm)
        }, 
    },
    data() {
			return {
				count: 1,
                dynamicValidateForm: [ { key: 1, value: "Pass 1" } ], 
                selected: "Physical Pass",
			}
		},
}
</script>

<style lang="scss"></style>