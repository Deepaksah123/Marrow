package kotlin;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MediaSourceListExternalSyntheticLambda0 {
    private static lambdaonDrmSessionAcquired6comgoogleandroidexoplayer2MediaSourceListForwardingEventListener read;
    private NfcAdapter IconCompatParcelizer;
    private Tag MediaBrowserCompatItemReceiver;
    private PendingIntent RemoteActionCompatParcelizer;
    private static IntentFilter[] AudioAttributesCompatParcelizer = {new IntentFilter("android.nfc.action.TECH_DISCOVERED"), new IntentFilter("android.nfc.action.TAG_DISCOVERED")};
    private static String[][] write = {new String[]{NfcA.class.getName(), IsoDep.class.getName()}};

    public MediaSourceListExternalSyntheticLambda0() {
        read = new lambdaonDrmSessionAcquired6comgoogleandroidexoplayer2MediaSourceListForwardingEventListener();
    }

    private boolean RemoteActionCompatParcelizer(IsoDep isoDep) throws IOException {
        byte[] bytes = "2PAY.SYS.DDF01".getBytes();
        isoDep.connect();
        byte[] bArrTransceive = isoDep.transceive(new lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onSourceInfoRefreshed.SELECT, bytes).write());
        lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrTransceive);
        if (lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(bArrTransceive)) {
            for (byte[] bArr : write(bArrTransceive)) {
                lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArr);
                try {
                    if (IconCompatParcelizer(isoDep, bArr)) {
                        isoDep.close();
                        return true;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        isoDep.close();
        return false;
    }

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    private static byte[] read(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return RemoteActionCompatParcelizer(bArr2);
        }
        if (bArr2 == null) {
            return RemoteActionCompatParcelizer(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static List<byte[]> write(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (lambdaonLoadCanceled2comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener : onDrmKeysLoaded.IconCompatParcelizer(bArr, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesCompatParcelizer, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.read)) {
            if (lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.write() == lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.read && arrayList.size() != 0) {
                arrayList.add(read((byte[]) arrayList.get(arrayList.size() - 1), lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.AudioAttributesCompatParcelizer()));
            } else {
                arrayList.add(lambdaonloadcanceled2comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.AudioAttributesCompatParcelizer());
            }
        }
        return arrayList;
    }

    private boolean IconCompatParcelizer(IsoDep isoDep, byte[] bArr) throws IOException {
        byte[] bArrWrite = new lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onSourceInfoRefreshed.SELECT, bArr).write();
        lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrWrite);
        byte[] bArrTransceive = isoDep.transceive(bArrWrite);
        lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrTransceive);
        if (lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(bArrTransceive)) {
            lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrTransceive);
            String string = "";
            for (byte b : onDrmKeysLoaded.AudioAttributesCompatParcelizer(bArrTransceive, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.write)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(String.format("%02X", Byte.valueOf(b)));
                string = sb.toString();
            }
            byte[] bArrAudioAttributesCompatParcelizer = onDrmKeysLoaded.AudioAttributesCompatParcelizer(bArrTransceive, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.MediaBrowserCompatItemReceiver);
            if (bArrAudioAttributesCompatParcelizer != null) {
                lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer);
            }
            byte[] bArrAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(bArrAudioAttributesCompatParcelizer, isoDep);
            if (bArrAudioAttributesCompatParcelizer2 != null) {
                lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer2);
            }
            if (lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(bArrAudioAttributesCompatParcelizer2)) {
                lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer2);
                return write(isoDep, bArrAudioAttributesCompatParcelizer2);
            }
        }
        return false;
    }

    private static byte[] RemoteActionCompatParcelizer(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        if (i > bArr.length) {
            i = bArr.length;
        }
        int i2 = i - 2;
        if (i2 <= 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 2, bArr2, 0, i2);
        return bArr2;
    }

    private boolean write(IsoDep isoDep, byte[] bArr) throws IOException {
        boolean zAudioAttributesCompatParcelizer;
        byte[] bArrAudioAttributesCompatParcelizer = onDrmKeysLoaded.AudioAttributesCompatParcelizer(bArr, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.MediaBrowserCompatCustomActionResultReceiver);
        if (bArrAudioAttributesCompatParcelizer != null) {
            lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer);
            bArrAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(bArrAudioAttributesCompatParcelizer, bArrAudioAttributesCompatParcelizer.length);
            zAudioAttributesCompatParcelizer = false;
        } else {
            zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArr);
            if (!zAudioAttributesCompatParcelizer) {
                bArrAudioAttributesCompatParcelizer = onDrmKeysLoaded.AudioAttributesCompatParcelizer(bArr, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer);
            }
        }
        if (bArrAudioAttributesCompatParcelizer != null) {
            for (MediaSourceListForwardingEventListener mediaSourceListForwardingEventListener : IconCompatParcelizer(bArrAudioAttributesCompatParcelizer)) {
                for (int iRemoteActionCompatParcelizer = mediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(); iRemoteActionCompatParcelizer <= mediaSourceListForwardingEventListener.IconCompatParcelizer(); iRemoteActionCompatParcelizer++) {
                    onSourceInfoRefreshed onsourceinforefreshed = onSourceInfoRefreshed.READ_RECORD;
                    byte[] bArrTransceive = isoDep.transceive(new lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onsourceinforefreshed, iRemoteActionCompatParcelizer, (mediaSourceListForwardingEventListener.read() << 3) | 4, 0).write());
                    if (lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesCompatParcelizer(bArrTransceive)) {
                        bArrTransceive = isoDep.transceive(new lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onsourceinforefreshed, iRemoteActionCompatParcelizer, (mediaSourceListForwardingEventListener.read() << 3) | 4, bArrTransceive[bArrTransceive.length - 1]).write());
                    }
                    if (lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(bArrTransceive) && (zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(bArrTransceive))) {
                        return zAudioAttributesCompatParcelizer;
                    }
                }
            }
        }
        return zAudioAttributesCompatParcelizer;
    }

    private static boolean AudioAttributesCompatParcelizer(byte[] bArr) throws IOException {
        byte[] bArrAudioAttributesCompatParcelizer = onDrmKeysLoaded.AudioAttributesCompatParcelizer(bArr, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesImplApi26Parcelizer, lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesImplApi21Parcelizer);
        lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer);
        return bArrAudioAttributesCompatParcelizer != null && read(bArrAudioAttributesCompatParcelizer);
    }

    private static byte[] AudioAttributesCompatParcelizer(byte[] bArr, IsoDep isoDep) throws IOException {
        List<lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> listIconCompatParcelizer = onDrmKeysLoaded.IconCompatParcelizer(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            byteArrayOutputStream.write(onDrmKeysLoaded.IconCompatParcelizer(listIconCompatParcelizer));
            Iterator<lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener> it = listIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(lambdaonLoadError3comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(it.next()));
            }
        } catch (IOException unused) {
        }
        return isoDep.transceive(new lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onSourceInfoRefreshed.GPO, byteArrayOutputStream.toByteArray()).write());
    }

    private static List<MediaSourceListForwardingEventListener> IconCompatParcelizer(byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() >= 4) {
            MediaSourceListForwardingEventListener mediaSourceListForwardingEventListener = new MediaSourceListForwardingEventListener();
            mediaSourceListForwardingEventListener.write(byteArrayInputStream.read() >> 3);
            mediaSourceListForwardingEventListener.read(byteArrayInputStream.read());
            mediaSourceListForwardingEventListener.AudioAttributesCompatParcelizer(byteArrayInputStream.read());
            byteArrayInputStream.read();
            arrayList.add(mediaSourceListForwardingEventListener);
        }
        return arrayList;
    }

    private static boolean read(byte[] bArr) {
        try {
            String string = "";
            for (byte b : bArr) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(String.format("%02X", Byte.valueOf(b)));
                string = sb.toString();
            }
            String[] strArrSplit = string.split("D");
            read.IconCompatParcelizer(strArrSplit[0]);
            read.RemoteActionCompatParcelizer(strArrSplit[1].substring(2, 4));
            read.read(strArrSplit[1].substring(0, 2));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean AudioAttributesCompatParcelizer(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.IconCompatParcelizer = defaultAdapter;
        return defaultAdapter != null;
    }

    public final String RemoteActionCompatParcelizer(Intent intent) {
        NfcAdapter nfcAdapter;
        try {
            lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.write();
            if (intent.getAction().equals("android.nfc.action.TECH_DISCOVERED") && (nfcAdapter = this.IconCompatParcelizer) != null && nfcAdapter.isEnabled()) {
                Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
                this.MediaBrowserCompatItemReceiver = tag;
                if (tag != null) {
                    RemoteActionCompatParcelizer(IsoDep.get(tag));
                }
                String str = read.read();
                String strAudioAttributesCompatParcelizer = read.AudioAttributesCompatParcelizer();
                String strRemoteActionCompatParcelizer = read.RemoteActionCompatParcelizer();
                if (str == null || strAudioAttributesCompatParcelizer == null || strRemoteActionCompatParcelizer == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cardNumber", read.read());
                jSONObject.put("expiryMonth", read.AudioAttributesCompatParcelizer());
                jSONObject.put("expiryYear", read.RemoteActionCompatParcelizer());
                return jSONObject.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public final boolean write(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.IconCompatParcelizer = defaultAdapter;
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        return false;
    }

    public final void write(Activity activity) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.RemoteActionCompatParcelizer = PendingIntent.getActivity(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), activity.getClass()).addFlags(536870912), 33554432);
        } else {
            this.RemoteActionCompatParcelizer = PendingIntent.getActivity(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), activity.getClass()).addFlags(536870912), 67108864);
        }
        this.IconCompatParcelizer.enableForegroundDispatch(activity, this.RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, write);
    }

    public final void RemoteActionCompatParcelizer(Activity activity) {
        NfcAdapter nfcAdapter = this.IconCompatParcelizer;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(activity);
        }
    }
}
