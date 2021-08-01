import Vue from 'vue'
import VueRouter from 'vue-router'
import Pie from '../views/Pie'
import Table from '../views/Table'
import Bar from "@/views/Bar";
import Edit from '../views/Edit'
import Add from '../views/Add'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        component: Table
    },
    {
        path: '/bar',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        // component: () => import(/* webpackChunkName: "about" */ '../views/Bar.vue')
        component: Bar
    },
    {
        path: '/pie',
        component: Pie
    },
    {
        path: '/table',
        component: Table
    },
    {
        path: '/edit',
        component: Edit
    },
    {
        path: '/add',
        component: Add
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
