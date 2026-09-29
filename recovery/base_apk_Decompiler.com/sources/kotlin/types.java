package kotlin;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class types {
    private String RemoteActionCompatParcelizer;
    private _deserializeUsingProperties read;
    private write write;
    private int AudioAttributesImplApi26Parcelizer = 0;
    private String MediaBrowserCompatItemReceiver = null;
    private int IconCompatParcelizer = 0;
    private ArrayList<read> AudioAttributesCompatParcelizer = new ArrayList<>();

    protected void IconCompatParcelizer(Object obj) {
    }

    public final boolean write() {
        return this.IconCompatParcelizer == 1;
    }

    static class read {
        int AudioAttributesCompatParcelizer;
        float IconCompatParcelizer;
        float RemoteActionCompatParcelizer;
        float read;
        float write;

        read(int i, float f, float f2, float f3, float f4) {
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = f4;
            this.read = f2;
            this.write = f;
            this.RemoteActionCompatParcelizer = f3;
        }
    }

    public String toString() {
        String string = this.RemoteActionCompatParcelizer;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (read readVar : this.AudioAttributesCompatParcelizer) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("[");
            sb.append(readVar.AudioAttributesCompatParcelizer);
            sb.append(" , ");
            sb.append(decimalFormat.format(readVar.IconCompatParcelizer));
            sb.append("] ");
            string = sb.toString();
        }
        return string;
    }

    public final void IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final float AudioAttributesCompatParcelizer(float f) {
        return (float) this.write.write(f);
    }

    public final float read(float f) {
        return (float) this.write.IconCompatParcelizer(f);
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.AudioAttributesCompatParcelizer.add(new read(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.IconCompatParcelizer = i3;
        }
        this.AudioAttributesImplApi26Parcelizer = i2;
        IconCompatParcelizer(obj);
        this.MediaBrowserCompatItemReceiver = str;
    }

    public final void read(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.AudioAttributesCompatParcelizer.add(new read(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.IconCompatParcelizer = i3;
        }
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaBrowserCompatItemReceiver = str;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        int size = this.AudioAttributesCompatParcelizer.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.AudioAttributesCompatParcelizer, new Comparator<read>() { // from class: o.types.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(read readVar, read readVar2) {
                return IconCompatParcelizer(readVar, readVar2);
            }

            private static int IconCompatParcelizer(read readVar, read readVar2) {
                return Integer.compare(readVar.AudioAttributesCompatParcelizer, readVar2.AudioAttributesCompatParcelizer);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.write = new write(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer, size);
        int i = 0;
        for (read readVar : this.AudioAttributesCompatParcelizer) {
            dArr[i] = ((double) readVar.write) * 0.01d;
            dArr2[i][0] = readVar.IconCompatParcelizer;
            dArr2[i][1] = readVar.read;
            dArr2[i][2] = readVar.RemoteActionCompatParcelizer;
            this.write.read(i, readVar.AudioAttributesCompatParcelizer, readVar.write, readVar.read, readVar.RemoteActionCompatParcelizer, readVar.IconCompatParcelizer);
            i++;
        }
        this.write.RemoteActionCompatParcelizer(f);
        this.read = _deserializeUsingProperties.AudioAttributesCompatParcelizer(0, dArr, dArr2);
    }

    static class write {
        private _deserializeUsingProperties AudioAttributesCompatParcelizer;
        private float[] AudioAttributesImplApi21Parcelizer;
        private float[] AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private FactoryBasedEnumDeserializer IconCompatParcelizer;
        private float[] MediaBrowserCompatCustomActionResultReceiver;
        private double[] MediaBrowserCompatItemReceiver;
        private final int MediaBrowserCompatMediaItem;
        private double[] MediaBrowserCompatSearchResultReceiver;
        private final int MediaDescriptionCompat;
        private float[] MediaMetadataCompat;
        private double[] RatingCompat;
        private float RemoteActionCompatParcelizer;
        private int onCommand;
        private float[] read;
        private final int write;

        write(int i, String str, int i2, int i3) {
            FactoryBasedEnumDeserializer factoryBasedEnumDeserializer = new FactoryBasedEnumDeserializer();
            this.IconCompatParcelizer = factoryBasedEnumDeserializer;
            this.write = 0;
            this.AudioAttributesImplBaseParcelizer = 1;
            this.MediaDescriptionCompat = 2;
            this.onCommand = i;
            this.MediaBrowserCompatMediaItem = i2;
            factoryBasedEnumDeserializer.read(i, str);
            this.MediaMetadataCompat = new float[i3];
            this.MediaBrowserCompatItemReceiver = new double[i3];
            this.AudioAttributesImplApi26Parcelizer = new float[i3];
            this.read = new float[i3];
            this.AudioAttributesImplApi21Parcelizer = new float[i3];
            this.MediaBrowserCompatCustomActionResultReceiver = new float[i3];
        }

        public final double write(float f) {
            _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesCompatParcelizer;
            if (_deserializeusingproperties != null) {
                _deserializeusingproperties.read(f, this.MediaBrowserCompatSearchResultReceiver);
            } else {
                double[] dArr = this.MediaBrowserCompatSearchResultReceiver;
                dArr[0] = this.read[0];
                dArr[1] = this.AudioAttributesImplApi21Parcelizer[0];
                dArr[2] = this.MediaMetadataCompat[0];
            }
            double[] dArr2 = this.MediaBrowserCompatSearchResultReceiver;
            return dArr2[0] + (this.IconCompatParcelizer.write(f, dArr2[1]) * this.MediaBrowserCompatSearchResultReceiver[2]);
        }

        public final double IconCompatParcelizer(float f) {
            _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesCompatParcelizer;
            if (_deserializeusingproperties != null) {
                double d = f;
                _deserializeusingproperties.AudioAttributesCompatParcelizer(d, this.RatingCompat);
                this.AudioAttributesCompatParcelizer.read(d, this.MediaBrowserCompatSearchResultReceiver);
            } else {
                double[] dArr = this.RatingCompat;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double dWrite = this.IconCompatParcelizer.write(d2, this.MediaBrowserCompatSearchResultReceiver[1]);
            double dIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(d2, this.MediaBrowserCompatSearchResultReceiver[1], this.RatingCompat[1]);
            double[] dArr2 = this.RatingCompat;
            return dArr2[0] + (dWrite * dArr2[2]) + (dIconCompatParcelizer * this.MediaBrowserCompatSearchResultReceiver[2]);
        }

        public final void read(int i, int i2, float f, float f2, float f3, float f4) {
            this.MediaBrowserCompatItemReceiver[i] = ((double) i2) / 100.0d;
            this.AudioAttributesImplApi26Parcelizer[i] = f;
            this.read[i] = f2;
            this.AudioAttributesImplApi21Parcelizer[i] = f3;
            this.MediaMetadataCompat[i] = f4;
        }

        public final void RemoteActionCompatParcelizer(float f) {
            this.RemoteActionCompatParcelizer = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.MediaBrowserCompatItemReceiver.length, 3);
            float[] fArr = this.MediaMetadataCompat;
            this.MediaBrowserCompatSearchResultReceiver = new double[fArr.length + 2];
            this.RatingCompat = new double[fArr.length + 2];
            if (this.MediaBrowserCompatItemReceiver[0] > 0.0d) {
                this.IconCompatParcelizer.write(0.0d, this.AudioAttributesImplApi26Parcelizer[0]);
            }
            double[] dArr2 = this.MediaBrowserCompatItemReceiver;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.IconCompatParcelizer.write(1.0d, this.AudioAttributesImplApi26Parcelizer[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.read[i];
                dArr3[1] = this.AudioAttributesImplApi21Parcelizer[i];
                dArr3[2] = this.MediaMetadataCompat[i];
                this.IconCompatParcelizer.write(this.MediaBrowserCompatItemReceiver[i], this.AudioAttributesImplApi26Parcelizer[i]);
            }
            this.IconCompatParcelizer.read();
            double[] dArr4 = this.MediaBrowserCompatItemReceiver;
            if (dArr4.length > 1) {
                this.AudioAttributesCompatParcelizer = _deserializeUsingProperties.AudioAttributesCompatParcelizer(0, dArr4, dArr);
            } else {
                this.AudioAttributesCompatParcelizer = null;
            }
        }
    }
}
