
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Ai모형관리Ai모형Manager from "./components/listers/Ai모형관리Ai모형Cards"
import Ai모형관리Ai모형Detail from "./components/listers/Ai모형관리Ai모형Detail"

import 데이터시각화관리시각화지도Manager from "./components/listers/데이터시각화관리시각화지도Cards"
import 데이터시각화관리시각화지도Detail from "./components/listers/데이터시각화관리시각화지도Detail"

import 데이터관리데이터집합Manager from "./components/listers/데이터관리데이터집합Cards"
import 데이터관리데이터집합Detail from "./components/listers/데이터관리데이터집합Detail"
import 데이터관리분석결과집합Manager from "./components/listers/데이터관리분석결과집합Cards"
import 데이터관리분석결과집합Detail from "./components/listers/데이터관리분석결과집합Detail"

import 통계관리통계관리Manager from "./components/listers/통계관리통계관리Cards"
import 통계관리통계관리Detail from "./components/listers/통계관리통계관리Detail"

import Ai요약관리Ai요약Manager from "./components/listers/Ai요약관리Ai요약Cards"
import Ai요약관리Ai요약Detail from "./components/listers/Ai요약관리Ai요약Detail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/ai모형관리/ai모형',
                name: 'Ai모형관리Ai모형Manager',
                component: Ai모형관리Ai모형Manager
            },
            {
                path: '/ai모형관리/ai모형/:id',
                name: 'Ai모형관리Ai모형Detail',
                component: Ai모형관리Ai모형Detail
            },

            {
                path: '/데이터시각화관리/시각화지도',
                name: '데이터시각화관리시각화지도Manager',
                component: 데이터시각화관리시각화지도Manager
            },
            {
                path: '/데이터시각화관리/시각화지도/:id',
                name: '데이터시각화관리시각화지도Detail',
                component: 데이터시각화관리시각화지도Detail
            },

            {
                path: '/데이터관리/데이터집합',
                name: '데이터관리데이터집합Manager',
                component: 데이터관리데이터집합Manager
            },
            {
                path: '/데이터관리/데이터집합/:id',
                name: '데이터관리데이터집합Detail',
                component: 데이터관리데이터집합Detail
            },
            {
                path: '/데이터관리/분석결과집합',
                name: '데이터관리분석결과집합Manager',
                component: 데이터관리분석결과집합Manager
            },
            {
                path: '/데이터관리/분석결과집합/:id',
                name: '데이터관리분석결과집합Detail',
                component: 데이터관리분석결과집합Detail
            },

            {
                path: '/통계관리/통계관리',
                name: '통계관리통계관리Manager',
                component: 통계관리통계관리Manager
            },
            {
                path: '/통계관리/통계관리/:id',
                name: '통계관리통계관리Detail',
                component: 통계관리통계관리Detail
            },

            {
                path: '/ai요약관리/ai요약',
                name: 'Ai요약관리Ai요약Manager',
                component: Ai요약관리Ai요약Manager
            },
            {
                path: '/ai요약관리/ai요약/:id',
                name: 'Ai요약관리Ai요약Detail',
                component: Ai요약관리Ai요약Detail
            },




    ]
})
