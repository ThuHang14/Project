import React from 'react'
import './services.css'
import {BsDot} from 'react-icons/bs'

const experience = () => {
  return (
    <section id='services'>
      <h2>Bản sắc ẩm thực riêng biệt giữa ba miền Bắc, Trung, Nam</h2>
   
   <div className="container services_container">

     {/* BAC */}
     <article className="service bac">
       <div className="service_head">
         <h3>miền Bắc</h3>
        </div>     
 
        <ul className="serve_list">
         
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
              Người miền Bắc có khẩu vị chuộng những món ăn thanh đạm, nhẹ nhàng, có vị chua nhẹ.</p>
          </li>
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
              Các món ăn tiêu biểu của người miền Bắc là phở Hà Nội, bún chả, bún thang, miến xào cua bể, bánh tôm Hồ Tây, thịt đông.</p>
          </li>
        </ul>
         </article>

         {/* TRUNG */}

         <article className="service trung">
       <div className="service_head">
         <h3>miền Trung</h3>
        </div>     
 
        <ul className="serve_list">
         
      
         
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
              Những món ăn miền Trung thường có vị cay, mặn và màu sắc món ăn rất phong phú</p>
          </li>
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
              Các món ăn đặc trưng của miền Trung gồm có bún bò Huế, bánh xèo, bánh đập, chả ram, bún cá,bánh tráng thịt luộc.</p>
          </li>
        </ul>
         </article>

        {/* NAM*/}

         <article className="service nam">
       <div className="service_head">
         <h3>miền Nam</h3>
        </div>     
 
        <ul className="serve_list">
        
         
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
              Những món ăn người miền Nam thường được nêm nếm ngọt, béo, dùng nhiều đường, nước cốt dừa</p>
          </li>
          <li>
            
            <p>
              <BsDot className='service_list_icon'/>
               Các món ăn tiêu biểu của người miền Nam là cá lóc nướng thui, gỏi cuốn, bún mắm, hủ tiếu Nam Vang, bánh bò.</p>
          </li>
        </ul>
         </article>
   </div>
    </section>
  )
}

export default experience