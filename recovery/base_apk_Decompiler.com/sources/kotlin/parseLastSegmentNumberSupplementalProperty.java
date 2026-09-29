package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.marrow.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class parseLastSegmentNumberSupplementalProperty {
    static {
        new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    }

    public static String read(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr != null) {
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        return jSONArray.toString();
    }

    public static String RemoteActionCompatParcelizer(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray.toString();
    }

    public static Object read(String str) {
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str)) {
            return null;
        }
        try {
            try {
                return new JSONArray(str);
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return new JSONObject(str);
        }
    }

    public static JSONObject AudioAttributesCompatParcelizer(String str) {
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONArray write(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String AudioAttributesCompatParcelizer(Context context) {
        BufferedReader bufferedReader;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.states);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, CharsetNames.UTF_8));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                stringWriter.write(cArr, 0, i);
            } else {
                String string = stringWriter.toString();
                try {
                    inputStreamOpenRawResource.close();
                    return string;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return string;
                }
            }
            inputStreamOpenRawResource.close();
        }
    }

    public static String[] RemoteActionCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(write(str));
    }

    public static String[] RemoteActionCompatParcelizer(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public static List<String> MediaBrowserCompatItemReceiver(String str) {
        JSONArray jSONArrayWrite = write(str);
        ArrayList arrayList = new ArrayList();
        if (jSONArrayWrite != null) {
            int length = jSONArrayWrite.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayWrite.optString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList<String> AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    public static JSONArray IconCompatParcelizer(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }

    public static String IconCompatParcelizer(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1).toUpperCase());
        sb.append(str.substring(1));
        return sb.toString();
    }
}
