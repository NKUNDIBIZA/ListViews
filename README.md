<h1><b>This application implements simple and custom Lists in android</b></h1>

<p><pre>By clicking on the first list entry also called NextList, the following activity
which contains a new type of list is launched.</pre></p>
<ol>
  <li> <b>MainActivity:</b> Implements the simplest list with built in layout.</li><br>
  <li> <b>SimpleListLayout:</b> This activity creates another simple list, but it gets its layout<br>
         from a custom TextView, Thus, you can Modify its font size, text color, padding and any<br>
        other TextView attribute. This list also contains a search EditText</li><br>
  <li> <b>ComplexList:</b> This activity uses PersonListAdapter to attach an ArrayList of Person
       Object class on TextViwes that are in adapter_view_layout<br></li><br>    
  <li> <b>CompListBestPractice:</b> This activity uses PersonListAdapterBestPractice to attach an ArrayList of Person
            Object class on TextViwes that are in adapter_view__best_practice_layout Above all<br>
            It also load list Objects small portion at a time.<br></li><br>  
 <li> <b>CompListBestPracticeWithImages:</b> This activity uses PersonListAdapterBestPractice to<br>
         attach an ArrayList of Person Object class on TextViwes that are in<br>
         adapter_view__best_practice_with_pictures_layout Above all It also load list Objects<br>
         small portion at a time. It also loads images from pixelbay using Univeral<br>
         image loader<br></li><br>                     
<ol>
