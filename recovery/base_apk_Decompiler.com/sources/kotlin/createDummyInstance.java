package kotlin;

import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.getReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getReader$read;", "Lo/bufferMapProperty;", "p0", "", "p1", "", "RemoteActionCompatParcelizer", "(Lo/getReader$read;Lo/bufferMapProperty;I)Ljava/lang/String;", "Landroid/content/Context;", "write", "(Landroid/content/Context;)I", "(Lo/getReader$read;Landroid/content/Context;)Ljava/lang/String;", "", "read", "(F)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class createDummyInstance {
    public static final String RemoteActionCompatParcelizer(getReader.read readVar, final bufferMapProperty buffermapproperty, int i) {
        boolean z;
        float fRemoteActionCompatParcelizer;
        if (i == 0) {
            return ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(readVar.AudioAttributesCompatParcelizer(), null, null, null, 0, null, new getAnswerMap() { // from class: o.DeserializationProblemHandler
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return createDummyInstance.AudioAttributesCompatParcelizer(buffermapproperty, (getReader.write) obj);
                }
            }, 31, null);
        }
        List<getReader.write> listAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        int i2 = 0;
        String string = "";
        boolean z2 = false;
        while (i2 < size) {
            getReader.write writeVar = listAudioAttributesCompatParcelizer.get(i2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) writeVar.read(), (Object) "wght")) {
                fRemoteActionCompatParcelizer = read(writeVar.RemoteActionCompatParcelizer(buffermapproperty) + i);
                z = true;
            } else {
                z = z2;
                fRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(buffermapproperty);
            }
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(',');
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append('\'');
            sb2.append(writeVar.read());
            sb2.append("' ");
            sb2.append(fRemoteActionCompatParcelizer);
            string = sb2.toString();
            i2++;
            z2 = z;
        }
        if (z2) {
            return string;
        }
        float f = read(i + 400.0f);
        if (!readVar.AudioAttributesCompatParcelizer().isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(',');
            string = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append("'wght' ");
        sb4.append(f);
        return sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty, getReader.write writeVar) {
        StringBuilder sb = new StringBuilder("'");
        sb.append(writeVar.read());
        sb.append("' ");
        sb.append(writeVar.RemoteActionCompatParcelizer(buffermapproperty));
        return sb.toString();
    }

    public static final int write(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final String RemoteActionCompatParcelizer(getReader.read readVar, Context context) {
        return RemoteActionCompatParcelizer(readVar, _findMissing.write(context), write(context));
    }

    private static final float read(float f) {
        return getQues.read(f, 1.0f, 1000.0f);
    }
}
