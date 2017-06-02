   package com.example.android.quakereport;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import java.text.DecimalFormat;
        import java.util.Date;
        import java.util.List;


     /**
        * Created by Dell on 31-05-2017.
       */

       public class EarthquakeAdapter extends ArrayAdapter<EarthQuake> {
         String primaryLocation;
         String locationOffset;
         private static final String LOCATION_SEPARATOR = " of ";


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
               String formattmagnitude=formatMagnitude(currentEarthquake.getmagnitude());
          magnitudeview.setText(formattmagnitude);




          String originallocation=currentEarthquake.getPlace();

          if (originallocation.contains(LOCATION_SEPARATOR)) {
              String[] parts = originallocation.split(LOCATION_SEPARATOR);
              locationOffset = parts[0] + LOCATION_SEPARATOR;
              primaryLocation = parts[1];
          } else {
              locationOffset = getContext().getString(R.string.near_the);
              primaryLocation = originallocation;
          }

          TextView primaryLocationView = (TextView) Listitemview.findViewById(R.id.place);
          primaryLocationView.setText(primaryLocation);

          TextView locationOffsetView = (TextView)Listitemview.findViewById(R.id.placenear);
          locationOffsetView.setText(locationOffset);

           Date dateobject=new Date(currentEarthquake.gettimeinmillisecond());
           TextView dateview= (TextView) Listitemview.findViewById(R.id.Date);


          android.text.format.DateFormat df = new android.text.format.DateFormat(); dateview.setText(df.format("dd/MM/yyyy hh:mm:ss", dateobject).toString());




           return Listitemview;


           }

         private String formatMagnitude(Double magnitude) {
             DecimalFormat decimaformat=new DecimalFormat("0.0");
             return decimaformat.format(magnitude);


         }


     }
