import React from 'react'
import './about.css'
const about = () => {
  return (
   <section id='about'>
      <h5>Get To Know</h5>
      <h2>About Việt Nam</h2>
      <div className="container about_container">

        <div className="about_vn">
          <div className="about_image">
              <div> 
                <h2>❀ Di sản thiên nhiên thế giới:</h2> 
                <li>  Vịnh Hạ Long</li>
                <li>  Vườn Quốc gia Phong Nha - Kẻ Bàng</li>
                <br />
              </div>

              <div> 
                  <h2>❀  Di sản văn hóa thế giới:</h2> 
                  <li>Cố đô Huế</li>
                  <li>Thánh địa Mỹ Sơn</li>
                  <li>Hoàng thành Thăng Long</li>
                  <li>Thành nhà Hồ</li>
                </div>
          </div>
        </div>

        <div className="about_content">

          <div className="about_cards">
            <article className="about_card">
                <h3>➊ Địa lý</h3>
                <small>diện tích 331.212 km².<br></br>
                </small>
            </article>

            <article className="about_card">
                <h3>➋ Sinh thái</h3>
                <small>Việt Nam nằm trong vùng sinh thái Indomalaya</small>
            </article>

            <article className="about_card">
                <h3>➌ Khí hậu</h3>
                <small>
                Nhiệt độ trung bình năm từ 22ºC đến 27ºC</small>
            </article>
          </div>

              <p>
                <i>“</i> Ký ức Hội An – được công nhận là show diễn thực cảnh lớn nhất thế giới. <br/>
              Áo dài là trang phục truyền thống phổ biến ở Việt Nam. <br/>
              Các môn thể thao truyền thống Việt Nam có đấu vật, võ thuật, đá cầu, cờ tướng...
              <i>”</i>
              </p>
        </div>

        
      </div>
   </section>
  )
}

export default about