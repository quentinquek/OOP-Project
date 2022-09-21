<!-- 
	This is the sign in page, it uses the dashboard layout in: 
	"./layouts/Default.vue" .
 -->

<template>
  <div class="sign-in">
    <a-row type="flex" justify="space-around" align="middle">
      <!-- Sign In Form Column -->
      <a-col
        :span="24"
        :md="12"
        :lg="{ span: 12}"
        :xl="{ span: 6}"
        class="col-form"
        :style="{ 'background-color': 'white' }"
      >
        <div class="brand text-center mb-15">
          <img src="images/logo/sss.svg" alt="sss logo" />
        </div>

        <h6 class="font-regular text-muted text-center">Welcome Back! 👋</h6>

        <!-- Sign In Form -->
        <a-form
          id="components-form-demo-normal-login"
          :form="form"
          class="login-form"
          @submit="handleSubmit"
          :hideRequiredMark="true"
        >
          <a-form-item class="mb-10" label="Email" :colon="false">
            <a-input
              v-decorator="[
                'email',
                {
                  rules: [
                    { required: true, message: 'Please enter your email!' },
                  ],
                },
              ]"
              placeholder="Email"
            />
          </a-form-item>
          <a-form-item class="mb-5" label="Password" :colon="false">
            <a-input
              v-decorator="[
                'password',
                {
                  rules: [
                    { required: true, message: 'Please enter your password!' },
                  ],
                },
              ]"
              type="password"
              placeholder="Password"
            />
          </a-form-item>
          <!-- <a-form-item class="mb-10">
    					<a-switch v-model="rememberMe" /> Remember Me
					</a-form-item> -->
          <a-form-item>
            <a-button
              block
              html-type="submit"
              class="login-form-button"
              :style="{ 'background-color': '#0C41FF', color: 'white' }"
            >
              LOGIN
            </a-button>
          </a-form-item>
        </a-form>
        <!-- / Sign In Form -->

        <p class="font-semibold text-muted text-center">
          <router-link
            to="/sign-in"
            class="font-bold text-dark"
            :style="{ color: 'blue' }"
            >Forgot Password</router-link
          >
        </p>
      </a-col>
      <!-- / Sign In Form Column -->
    </a-row>
  </div>
</template>

<script>
export default {
  data() {
    return {
      // Binded model property for "Sign In Form" switch button for "Remember Me" .
      rememberMe: true,
    };
  },
  beforeCreate() {
    // Creates the form and adds to it component's "form" property.
    this.form = this.$form.createForm(this, { name: "normal_login" });
  },
  methods: {
    // Handles input validation after submission.
    handleSubmit(e) {
      e.preventDefault();
      this.form.validateFields((err, values) => {
        if (!err) {
          console.log("Received values of form: ", values);
        }
      });
    },
  },
};
</script>

<style lang="scss">
body {
  background-color: #ffffff;
  background-image: "url(images/sss-background.png)";
}
</style>