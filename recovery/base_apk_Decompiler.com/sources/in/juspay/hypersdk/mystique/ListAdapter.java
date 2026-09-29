package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.core.Renderer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ListAdapter extends BaseAdapter {
    private Context context;
    private float density;
    private final DuiCallback duiCallback;
    private JSONArray holderData;
    private JSONObject itemView;
    private Renderer renderer;
    private JSONArray rowData;
    private BitmapCache bitmapCache = BitmapCache.getInstance();
    private LruCache<String, Integer> colorCache = new LruCache<>(20);
    private LruCache<String, Drawable> drawableCache = new LruCache<>(50);
    private LruCache<String, Typeface> typefaceCache = new LruCache<>(20);
    private LruCache<String, Integer> typefaceWeightCache = new LruCache<>(20);

    class Holder {
        View[] views;

        Holder(View view) {
            this.views = new View[ListAdapter.this.holderData.length()];
            for (int i = 0; i < ListAdapter.this.holderData.length(); i++) {
                try {
                    this.views[i] = view.findViewById(ListAdapter.this.holderData.getJSONObject(i).getInt("id"));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public ListAdapter(Context context, Renderer renderer, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, DuiCallback duiCallback) {
        this.renderer = renderer;
        this.rowData = jSONArray2;
        this.itemView = jSONObject;
        this.holderData = jSONArray;
        this.duiCallback = duiCallback;
        this.context = context;
        this.density = context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void applyUpdate(android.view.View r7, org.json.JSONObject r8, org.json.JSONObject r9, int r10) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.ListAdapter.applyUpdate(android.view.View, org.json.JSONObject, org.json.JSONObject, int):void");
    }

    private View createView() {
        try {
            return this.renderer.createView(this.itemView);
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] getCorners(String[] strArr) {
        float[] fArr = new float[8];
        int i = 0;
        float f = Float.parseFloat(strArr[0]);
        for (int i2 = 1; i2 < strArr.length; i2++) {
            if (Boolean.parseBoolean(strArr[i2])) {
                fArr[i] = f;
                fArr[i + 1] = f;
                i += 2;
            } else {
                i += 2;
            }
        }
        return fArr;
    }

    private String getDefault(String str, String str2) {
        if (str.equals("onClick")) {
            return str2;
        }
        return null;
    }

    private String getString(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (Exception unused) {
            return str2;
        }
    }

    private void setAlpha(View view, String str) {
        view.setAlpha(Float.parseFloat(str));
    }

    private void setBackground(View view, String str) {
        if (str == null) {
            if (view.getBackground() instanceof GradientDrawable) {
                ((GradientDrawable) view.getBackground()).setColor(0);
            } else {
                view.setBackgroundDrawable(null);
            }
            view.setBackgroundDrawable(null);
            return;
        }
        Integer numValueOf = this.colorCache.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Color.parseColor(str));
            this.colorCache.put(str, numValueOf);
        }
        Drawable background = view.getBackground();
        if (background == null || ((background instanceof ColorDrawable) && ((ColorDrawable) background).getColor() != numValueOf.intValue())) {
            view.setBackgroundColor(numValueOf.intValue());
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(numValueOf.intValue());
        }
    }

    private void setClickListener(View view, final String str, final int i) {
        view.setOnClickListener(new View.OnClickListener() { // from class: in.juspay.hypersdk.mystique.ListAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                DuiCallback duiCallback = ListAdapter.this.duiCallback;
                StringBuilder sb = new StringBuilder("window.callUICallback('");
                sb.append(str);
                sb.append("',");
                sb.append(i);
                sb.append(");");
                duiCallback.addJsToWebView(sb.toString());
            }
        });
    }

    private void setCornerRadius(View view, String str) {
        GradientDrawable gradientDrawable;
        if (str != null) {
            String[] strArrSplit = str.split(",");
            float[] corners = new float[8];
            if (strArrSplit.length > 0) {
                try {
                    if (strArrSplit.length == 1) {
                        corners[0] = Float.parseFloat(strArrSplit[0]);
                    } else {
                        corners = getCorners(strArrSplit);
                    }
                    Drawable background = view.getBackground();
                    if (background instanceof ColorDrawable) {
                        gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(((ColorDrawable) background).getColor());
                        view.setBackground(gradientDrawable);
                    } else {
                        gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                    }
                    if (gradientDrawable != null) {
                        if (strArrSplit.length == 1) {
                            gradientDrawable.setCornerRadius(corners[0]);
                        } else {
                            gradientDrawable.setCornerRadii(corners);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:4:0x000a, B:6:0x0022, B:9:0x002a, B:11:0x0032, B:13:0x0039, B:15:0x0041, B:17:0x004d, B:23:0x0067, B:70:0x0164, B:72:0x016b, B:74:0x0178, B:37:0x008e, B:58:0x00c9, B:59:0x00d5, B:60:0x00df, B:44:0x00a2, B:47:0x00ac, B:50:0x00b6, B:61:0x00e9, B:62:0x00f8, B:64:0x00fe, B:65:0x010f, B:67:0x0117, B:26:0x0071, B:29:0x007b, B:68:0x0146), top: B:79:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:4:0x000a, B:6:0x0022, B:9:0x002a, B:11:0x0032, B:13:0x0039, B:15:0x0041, B:17:0x004d, B:23:0x0067, B:70:0x0164, B:72:0x016b, B:74:0x0178, B:37:0x008e, B:58:0x00c9, B:59:0x00d5, B:60:0x00df, B:44:0x00a2, B:47:0x00ac, B:50:0x00b6, B:61:0x00e9, B:62:0x00f8, B:64:0x00fe, B:65:0x010f, B:67:0x0117, B:26:0x0071, B:29:0x007b, B:68:0x0146), top: B:79:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178 A[Catch: Exception -> 0x017c, TRY_LEAVE, TryCatch #0 {Exception -> 0x017c, blocks: (B:4:0x000a, B:6:0x0022, B:9:0x002a, B:11:0x0032, B:13:0x0039, B:15:0x0041, B:17:0x004d, B:23:0x0067, B:70:0x0164, B:72:0x016b, B:74:0x0178, B:37:0x008e, B:58:0x00c9, B:59:0x00d5, B:60:0x00df, B:44:0x00a2, B:47:0x00ac, B:50:0x00b6, B:61:0x00e9, B:62:0x00f8, B:64:0x00fe, B:65:0x010f, B:67:0x0117, B:26:0x0071, B:29:0x007b, B:68:0x0146), top: B:79:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setFontStyle(android.view.View r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.ListAdapter.setFontStyle(android.view.View, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e A[Catch: Exception -> 0x01a9, TryCatch #2 {Exception -> 0x01a9, blocks: (B:5:0x000c, B:8:0x0019, B:10:0x0021, B:12:0x003a, B:15:0x0048, B:17:0x0065, B:64:0x019a, B:66:0x01a3, B:19:0x0073, B:25:0x0089, B:39:0x00b0, B:41:0x00ba, B:43:0x00c1, B:44:0x00d2, B:45:0x00ed, B:47:0x00fa, B:48:0x010e, B:50:0x0116, B:57:0x0140, B:58:0x014c, B:60:0x0156, B:62:0x018d, B:28:0x0093, B:31:0x009d), top: B:74:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setImage(android.view.View r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.mystique.ListAdapter.setImage(android.view.View, java.lang.String):void");
    }

    private void setPackageIcon(View view, String str) {
        PackageManager packageManager = this.context.getPackageManager();
        ((ImageView) view).setImageDrawable(packageManager.getApplicationInfo(str, 0).loadIcon(packageManager));
    }

    private void setText(View view, String str) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText().equals(str)) {
                return;
            }
            textView.setText(str);
        }
    }

    private void setTextColor(View view, String str) {
        if (view instanceof TextView) {
            if (str == null) {
                ((TextView) view).setTextColor(-16777216);
                return;
            }
            Integer numValueOf = this.colorCache.get(str);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(Color.parseColor(str));
                this.colorCache.put(str, numValueOf);
            }
            ((TextView) view).setTextColor(numValueOf.intValue());
        }
    }

    private void setTextSize(View view, String str) {
        if (view instanceof TextView) {
            float f = Integer.parseInt(str) * this.density;
            TextView textView = (TextView) view;
            if (textView.getTextSize() != f) {
                textView.setTextSize(0, f);
            }
        }
    }

    private void setVisibility(View view, String str) {
        view.setVisibility(str.equalsIgnoreCase("gone") ? 8 : str.equalsIgnoreCase("invisible") ? 4 : 0);
    }

    private void updateView(View view, int i) throws JSONException {
        if (view.getTag() == null) {
            return;
        }
        Holder holder = (Holder) view.getTag();
        int i2 = 0;
        while (true) {
            View[] viewArr = holder.views;
            if (i2 >= viewArr.length) {
                return;
            }
            View view2 = viewArr[i2];
            if (view2 != null) {
                applyUpdate(view2, this.holderData.getJSONObject(i2), this.rowData.getJSONObject(i), i);
            }
            i2++;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.rowData.length();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = createView();
            if (view == null) {
                return new View(this.context);
            }
            view.setTag(new Holder(view));
        }
        try {
            updateView(view, i);
        } catch (Exception unused) {
        }
        return view;
    }

    public void updateRowData(JSONArray jSONArray) {
        this.rowData = jSONArray;
    }
}
