import React from 'react'
import './portfolio.css'
import SAPA from '../../assets/sapa.jpg'
import SAIGON from '../../assets/saigon.jpg'
import HANOI from '../../assets/hanoi.jpg'
import DALAT from '../../assets/dalat.jpg'
import HOIAN from '../../assets/hoi an.jpg'
import HUE from '../../assets/hue.jpg'
import MAICHAU from '../../assets/maichau.jpg'
import PHANTHIET from '../../assets/phanthiet.jpg'


// data
const data = [
  {
    id:1,
    
    image:DALAT,
    title : 'Đà Lạt',
    demo : 'https://sjhibu.csb.app/index.html'
  },
  {
    id:2,
    image:SAIGON,
    title : 'Hồ Chí Minh',
    demo : 'https://8j0j69.csb.app/index.html'

  },
  {
    id:3,
    image:HANOI,
    title : 'Hà Nội',
    demo : 'https://q678gm.csb.app/index.html'

  },
  {
    id:4,
    image:HUE,
    title : 'Huế',
    demo : 'https://mt0tpk.csb.app/index.html'

  },
  {
    id:5,
    image:HOIAN,
    title : 'Hội An',
    demo : 'https://hd8d3i.csb.app/index.html'

  },
  {
    id:6,
    
    
    image:SAPA,
    title : 'Sapa',
    demo : 'https://z7oj4t.csb.app/index.html'
  },
  {
    id:7,
    image:MAICHAU,
    title : 'Mai Châu',
    demo : 'https://58e1gx.csb.app/index.html'

  },
  {
    id:8,
    image:PHANTHIET,
    title : 'Phan Thiết',
    demo : 'https://sdyf5m.csb.app/index.html'

  },
  
]

// react
const experience = () => {
  return (
    <section id='portfolio'>
      <h5>Destinations</h5>
      <h2>let go</h2>

      <div className="container portfolio_container">       
        {
          data.map(({id,image,title,demo}) => {
            return(
              <article key={id} className='portfolio_items'>
              <div className="portfolio_items_img">
                <img src={image} alt={title} />
              </div>
              <h3>{title} </h3>
              <div className="portfolio_item-cta btn">
              <a href={demo} className='' target='_blank'>Read</a>
              </div>
               </article>
            )
          })
        }

           {/* <article className='portfolio_items'>
          <div className="portfolio_items_img">
            <img src={HALONG} alt="" />
          </div>
          <h3>this </h3>
          <div className="portfolio_item-cta btn">
          <a href="" className='' target='_blank'>Read</a>
          </div>
           </article>
           */}
      </div>
     </section>
  )
}

export default experience