package kotlin;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class decodeGeobFrame {
    private static final Date read = new Date(0);
    private JSONArray AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private JSONObject AudioAttributesImplBaseParcelizer;
    private JSONObject IconCompatParcelizer;
    private Date RemoteActionCompatParcelizer;
    private JSONObject write;

    /* synthetic */ decodeGeobFrame(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, byte b) throws JSONException {
        this(jSONObject, date, jSONArray, jSONObject2, j);
    }

    private decodeGeobFrame(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.write = jSONObject;
        this.RemoteActionCompatParcelizer = date;
        this.AudioAttributesCompatParcelizer = jSONArray;
        this.AudioAttributesImplBaseParcelizer = jSONObject2;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.IconCompatParcelizer = jSONObject3;
    }

    static decodeGeobFrame write(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new decodeGeobFrame(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    private static decodeGeobFrame read(JSONObject jSONObject) throws JSONException {
        return write(new JSONObject(jSONObject.toString()));
    }

    public final JSONObject IconCompatParcelizer() {
        return this.write;
    }

    public final Date AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final JSONArray read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final JSONObject AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof decodeGeobFrame) {
            return this.IconCompatParcelizer.toString().equals(((decodeGeobFrame) obj).toString());
        }
        return false;
    }

    public final Set<String> read(decodeGeobFrame decodegeobframe) throws JSONException {
        JSONObject jSONObjectIconCompatParcelizer = read(decodegeobframe.IconCompatParcelizer).IconCompatParcelizer();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = IconCompatParcelizer().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!decodegeobframe.IconCompatParcelizer().has(next)) {
                hashSet.add(next);
            } else if (!IconCompatParcelizer().get(next).equals(decodegeobframe.IconCompatParcelizer().get(next))) {
                hashSet.add(next);
            } else if ((AudioAttributesImplApi21Parcelizer().has(next) && !decodegeobframe.AudioAttributesImplApi21Parcelizer().has(next)) || (!AudioAttributesImplApi21Parcelizer().has(next) && decodegeobframe.AudioAttributesImplApi21Parcelizer().has(next))) {
                hashSet.add(next);
            } else if (AudioAttributesImplApi21Parcelizer().has(next) && decodegeobframe.AudioAttributesImplApi21Parcelizer().has(next) && !AudioAttributesImplApi21Parcelizer().getJSONObject(next).toString().equals(decodegeobframe.AudioAttributesImplApi21Parcelizer().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                jSONObjectIconCompatParcelizer.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectIconCompatParcelizer.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public static class read {
        private long AudioAttributesCompatParcelizer;
        private JSONObject IconCompatParcelizer;
        private JSONArray RemoteActionCompatParcelizer;
        private JSONObject read;
        private Date write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
            this.read = new JSONObject();
            this.write = decodeGeobFrame.read;
            this.RemoteActionCompatParcelizer = new JSONArray();
            this.IconCompatParcelizer = new JSONObject();
            this.AudioAttributesCompatParcelizer = 0L;
        }

        public final read RemoteActionCompatParcelizer(Map<String, String> map) {
            this.read = new JSONObject(map);
            return this;
        }

        public final read IconCompatParcelizer(JSONObject jSONObject) {
            try {
                this.read = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public final read AudioAttributesCompatParcelizer(Date date) {
            this.write = date;
            return this;
        }

        public final read write(JSONArray jSONArray) {
            try {
                this.RemoteActionCompatParcelizer = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public final read write(JSONObject jSONObject) {
            try {
                this.IconCompatParcelizer = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public final read AudioAttributesCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = j;
            return this;
        }

        public final decodeGeobFrame write() throws JSONException {
            return new decodeGeobFrame(this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }

    public static read write() {
        return new read((byte) 0);
    }
}
