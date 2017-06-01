   package com.example.android.quakereport;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import java.util.Date;
        import java.util.List;


     /**
        * Created by Dell on 31-05-2017.
       */

       public class EarthquakeAdapter extends ArrayAdapter<EarthQuake> {


           public EarthquakeAdapter(Context context, List<EarthQuake>earthquakes) {
            super(context,0,earthquakes);
          }




      public View getView(int position , View convertView , ViewGroup parent){

        View Listitemview=convertView;

              if(Listitemview==null){
                 Listitemview= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_listitem,parent,false);


                    }
             EarthQuake currentEarthquake=getItem(position);
                TextView magnitudeview= (TextView) Listitemview.findViewById(R.id.magnitude);
                magnitudeview.setText(currentEarthquake.getmagnitude());

           TextView placeview= (TextView) Listitemview.findViewById(R.id.place);
             placeview.setText(currentEarthquake.getPlace());

           Date dateobject=new Date(currentEarthquake.gettimeinmillisecond());
           TextView dateview= (TextView) Listitemview.findViewById(R.id.Date);


          android.text.format.DateFormat df = new android.text.format.DateFormat(); dateview.setText(df.format("dd/MM/yyyy hh:mm:ss", dateobject).toString());




           return Listitemview;


           }





      }
