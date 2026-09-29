package kotlin;

import android.text.Spannable;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0012\u001a\u00020\n*\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\b\u001a\u00020\n*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014"}, d2 = {"Landroid/text/Spannable;", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p0", "Lo/bufferMapProperty;", "p1", "", "write", "(Landroid/text/Spannable;Ljava/util/List;Lo/bufferMapProperty;)V", "", "p2", "p3", "RemoteActionCompatParcelizer", "(Landroid/text/Spannable;Lo/_findCustomMapDeserializer;IILo/bufferMapProperty;)V", "Lo/ReadableObjectIdReferring;", "read", "(J)I", "AudioAttributesCompatParcelizer", "Lo/_handleSingleArgumentCreator;", "(I)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getFromObjectArguments {
    private static final void RemoteActionCompatParcelizer(Spannable spannable, _findCustomMapDeserializer _findcustommapdeserializer, int i, int i2, bufferMapProperty buffermapproperty) {
        for (Object obj : spannable.getSpans(i, i2, _isGroovyMetaClassGetter.class)) {
            spannable.removeSpan((_isGroovyMetaClassGetter) obj);
        }
        getValueClass.IconCompatParcelizer(spannable, new modifyCollectionDeserializer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(_findcustommapdeserializer.getWrite()), read(_findcustommapdeserializer.getWrite()), ReadableObjectIdReferring.AudioAttributesCompatParcelizer(_findcustommapdeserializer.getRemoteActionCompatParcelizer()), read(_findcustommapdeserializer.getRemoteActionCompatParcelizer()), buffermapproperty, RemoteActionCompatParcelizer(_findcustommapdeserializer.getIconCompatParcelizer())), i, i2);
    }

    private static final int read(long j) {
        long jWrite = ReadableObjectIdReferring.write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            return 0;
        }
        return processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer()) ? 1 : 2;
    }

    private static final int RemoteActionCompatParcelizer(int i) {
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.write())) {
            return 0;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            return 1;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.RemoteActionCompatParcelizer())) {
            return 2;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.AudioAttributesCompatParcelizer())) {
            return 3;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return 4;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.IconCompatParcelizer())) {
            return 5;
        }
        if (_handleSingleArgumentCreator.write(i, _handleSingleArgumentCreator.INSTANCE.read())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    public static final void write(Spannable spannable, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, bufferMapProperty buffermapproperty) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer> audioAttributesCompatParcelizer = list.get(i);
            RemoteActionCompatParcelizer(spannable, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), audioAttributesCompatParcelizer.getWrite(), audioAttributesCompatParcelizer.write(), buffermapproperty);
        }
    }
}
