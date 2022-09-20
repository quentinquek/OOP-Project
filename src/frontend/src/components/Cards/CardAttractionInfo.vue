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
            <a-card v-for="eachPass in allPasses" :key="eachPass.key" :style="{'marginTop': '10px'}">
                <a-row :gutter="24" type="flex" :style="{'padding': '10px'}">
                    <h6>{{ eachPass.value }}</h6>
                </a-row>
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
                 <div>
                    <a-button type="danger" @click="deletePass">
                        <svg
                            width="16"
                            height="16"
                            viewBox="0 0 20 20"
                            fill="none"
                            xmlns="http://www.w3.org/2000/svg"
                        >
                            <path
                            fill-rule="evenodd"
                            clip-rule="evenodd"
                            d="M9 2C8.62123 2 8.27497 2.214 8.10557 2.55279L7.38197 4H4C3.44772 4 3 4.44772 3 5C3 5.55228 3.44772 6 4 6L4 16C4 17.1046 4.89543 18 6 18H14C15.1046 18 16 17.1046 16 16V6C16.5523 6 17 5.55228 17 5C17 4.44772 16.5523 4 16 4H12.618L11.8944 2.55279C11.725 2.214 11.3788 2 11 2H9ZM7 8C7 7.44772 7.44772 7 8 7C8.55228 7 9 7.44772 9 8V14C9 14.5523 8.55228 15 8 15C7.44772 15 7 14.5523 7 14V8ZM12 7C11.4477 7 11 7.44772 11 8V14C11 14.5523 11.4477 15 12 15C12.5523 15 13 14.5523 13 14V8C13 7.44772 12.5523 7 12 7Z"
                            fill="#FFFFFF"
                            />
                        </svg>
                        <span class="text-white">Delete Pass</span>
                    </a-button>
                </div>
            </a-card>
            <a-row :gutter="24" type="flex" :style="{'marginTop': '20px', 'marginLeft': '5px'}">
                <a-button type="dashed" style="width: 20%" @click="addPass">
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
        addPass() {
            console.log("=== This is Add Pass Function ===")
            this.allPasses.push({
                key: this.count++, 
                value: "Pass " + this.count
            });
            console.log(this.allPasses)
        }, 
        deletePass() {
            console.log("=== This is Delete Pass Function ===")
            this.allPasses.pop()
            this.count--
            console.log(this.allPasses)
        }
    },
    data() {
			return {
				count: 1,
                allPasses: [ { key: 1, value: "Pass 1" } ], 
                selected: "Physical Pass",
			}
		},
}
</script>

<style lang="scss"></style>