import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

let routes = [
  {
    // will match everything
    path: "*",
    component: () => import("../views/404.vue"),
  },
  {
    path: "/",
    name: "Home",
    redirect: "/calendar",
  },
  {
    path: "/booking-dashboard",
    name: "Dashboard",
    layout: "dashboard",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "dashboard" */ "../views/BookingDashboard.vue"),
  },
  {
    path: "/calendar",
    name: "Calendar",
    layout: "dashboard",
    component: () => import("../views/Calendar.vue"),
  },
  {
    path: "/layout",
    name: "Layout",
    layout: "dashboard",
    component: () => import("../views/Layout.vue"),
  },
  {
    path: "/my-bookings",
    name: "My Bookings",
    layout: "dashboard",
    component: () => import("../views/MyBookings.vue"),
  },
  {
    path: "/my-bookings/booking-details",
    name: "Booking details",
    layout: "dashboard",
    component: () => import("../views/BookingDetails.vue"),
  },
  {
    path: "/manage-corporate-pass",
    name: "Manage Corporate Pass",
    layout: "dashboard",
    component: () => import("../views/ManageCorporatePass.vue"),
  },
  {
    path: "/manage-corporate-pass/create-attraction",
    name: "Create Attraction",
    layout: "dashboard",
    component: () => import("../views/CreateAttraction.vue"),
  },
  {
    path: "/manage-corporate-pass/edit-pass",
    name: "Edit Pass",
    layout: "dashboard",
    component: () => import("../views/EditPass.vue"),
  },
  {
    // not in use
    path: "/billing",
    name: "Billing",
    layout: "dashboard",
    component: () => import("../views/Billing.vue"),
  },
  {
    // not in use
    path: "/rtl",
    name: "RTL",
    layout: "dashboard-rtl",
    meta: {
      layoutClass: "dashboard-rtl",
    },
    component: () => import("../views/RTL.vue"),
  },
  {
    path: "/Profile",
    name: "Profile",
    layout: "dashboard",
    meta: {
      layoutClass: "layout-profile",
    },
    component: () => import("../views/Profile.vue"),
  },
  {
    path: "/sign-in",
    name: "Sign-In",
    component: () => import("../views/Sign-In.vue"),
  },
  {
    path: "/sign-up",
    name: "Sign-Up",
    meta: {
      layoutClass: "layout-sign-up",
    },
    component: () => import("../views/Sign-Up.vue"),
  },
];

// Adding layout property from each route to the meta
// object so it can be accessed later.
function addLayoutToRoute( route, parentLayout = "default" )
{
	route.meta = route.meta || {} ;
	route.meta.layout = route.layout || parentLayout ;
	
	if( route.children )
	{
		route.children = route.children.map( ( childRoute ) => addLayoutToRoute( childRoute, route.meta.layout ) ) ;
	}
	return route ;
}

routes = routes.map( ( route ) => addLayoutToRoute( route ) ) ;

const router = new VueRouter({
	mode: 'hash',
	base: process.env.BASE_URL,
	routes,
	scrollBehavior (to, from, savedPosition) {
		if ( to.hash ) {
			return {
				selector: to.hash,
				behavior: 'smooth',
			}
		}
		return {
			x: 0,
			y: 0,
			behavior: 'smooth',
		}
	}
})

export default router
