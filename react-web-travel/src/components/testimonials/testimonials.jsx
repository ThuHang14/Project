import React from 'react'
import './testimonials.css'
import i1 from '../../assets/com.jpg'
import i2 from '../../assets/comtam.jpg'
import i3 from '../../assets/buncha.jpg'
import i4 from '../../assets/chaca.jpg'
import i5 from '../../assets/nemlui.jpg'
import i6 from '../../assets/u.jpg'
import i7 from '../../assets/rieu.jpg'
import i8 from '../../assets/banhcuon.jpg'
import i9 from '../../assets/dacua.jpg'
import i10 from '../../assets/pho.jpg'

// import Swiper core and required modules
import {Pagination } from 'swiper';

import { Swiper, SwiperSlide } from 'swiper/react';

// Import Swiper styles
import 'swiper/css';
import 'swiper/css/pagination';

const data=[
  {
    avatar : i1,
    name: 'Bánh cốm Hà Nội'
  }, {
    avatar : i2,
    name: 'Bánh hỏi lòng heo - Cháo lòng'
  }, {
    avatar : i3,
    name: 'Bún chả Hà Nội'
  }, {
    avatar : i4,
    name: 'Chả cá Lã Vọng'
  }, {
    avatar : i5,
    name: 'Nem lụi'
  },
  {
    avatar : i6,
    name: 'Bánh Ú Tro'
  }, {
    avatar : i7,
    name: 'Bún riêu'
  }, {
    avatar : i8,
    name: 'Bánh cuốn'
  }, {
    avatar : i9,
    name: 'Bánh đa cua'
  }, {
    avatar : i10,
    name: 'Phở tái nạm bò viên'
  }
]

const experience = () => {
  return (
    <section id='testimonials'>
      <h2>Go eat</h2>
      <Swiper className="container testimonials_container"
         // install Swiper modules
         modules={[Pagination]}
         spaceBetween={40}
         slidesPerView={1}
         pagination={{ clickable: true }}
         >
        {
          data.map(({avatar,name},index) => {
            return(
              <SwiperSlide key={index} className='testimonial'>
          <div className="client_avatar">
            <img src={avatar} alt="i1" />
          </div>
          <h4>{name}</h4>
        </SwiperSlide>
            )
          })
        }
      </Swiper>
    </section>
  )
}

export default experience