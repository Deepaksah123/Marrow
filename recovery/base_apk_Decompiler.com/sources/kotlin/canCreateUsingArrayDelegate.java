package kotlin;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._findCachedDeserializer;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010\u0012\u001a\u00020 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010#\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u0014\u0010'R\u001a\u0010+\u001a\u00020(8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b\u001d\u0010*R\u0014\u0010\u001b\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010-R\u0014\u0010.\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0014\u0010!\u001a\u0002028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u00105R\u001a\u00109\u001a\u0002068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b\u001b\u00108"}, d2 = {"Lo/canCreateUsingArrayDelegate;", "Lo/_findCustomBeanDeserializer;", "", "p0", "Lo/deserializeWithObjectId;", "p1", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p2", "Lo/_findCustomMapDeserializer;", "p3", "Lo/_reportMissingSetter$write;", "p4", "Lo/bufferMapProperty;", "p5", "<init>", "(Ljava/lang/String;Lo/deserializeWithObjectId;Ljava/util/List;Ljava/util/List;Lo/_reportMissingSetter$write;Lo/bufferMapProperty;)V", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "read", "MediaBrowserCompatItemReceiver", "Lo/deserializeWithObjectId;", "()Lo/deserializeWithObjectId;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "write", "IconCompatParcelizer", "Lo/_reportMissingSetter$write;", "Lo/bufferMapProperty;", "Lo/canInstantiate;", "RatingCompat", "Lo/canInstantiate;", "AudioAttributesImplBaseParcelizer", "()Lo/canInstantiate;", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "Lo/addIncludable;", "Lo/addIncludable;", "()Lo/addIncludable;", "MediaBrowserCompatCustomActionResultReceiver", "", "()F", "MediaBrowserCompatSearchResultReceiver", "Lo/getDefaultCreator;", "Lo/getDefaultCreator;", "MediaMetadataCompat", "", "Z", "MediaBrowserCompatMediaItem", "()Z", "", "I", "()I", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class canCreateUsingArrayDelegate implements _findCustomBeanDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final addIncludable MediaBrowserCompatCustomActionResultReceiver;
    private final _reportMissingSetter.write IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private getDefaultCreator MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final canInstantiate AudioAttributesImplApi26Parcelizer;
    private final List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final bufferMapProperty MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CharSequence AudioAttributesImplBaseParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public canCreateUsingArrayDelegate(String str, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2, _reportMissingSetter.write writeVar, bufferMapProperty buffermapproperty) {
        Object obj;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list3;
        AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer> audioAttributesCompatParcelizer;
        this.read = str;
        this.AudioAttributesCompatParcelizer = deserializewithobjectid;
        this.RemoteActionCompatParcelizer = list;
        this.write = list2;
        this.IconCompatParcelizer = writeVar;
        this.MediaBrowserCompatItemReceiver = buffermapproperty;
        canInstantiate caninstantiate = new canInstantiate(1, buffermapproperty.getRead());
        this.AudioAttributesImplApi26Parcelizer = caninstantiate;
        this.MediaBrowserCompatMediaItem = !createFromBoolean.IconCompatParcelizer(deserializewithobjectid) ? false : createUsingDefault.INSTANCE.IconCompatParcelizer().getRemoteActionCompatParcelizer().booleanValue();
        this.MediaDescriptionCompat = createFromBoolean.read(deserializewithobjectid.onPlayFromUri(), deserializewithobjectid.onAddQueueItem());
        getMagicModuleStat getmagicmodulestat = new getMagicModuleStat() { // from class: o.canCreateFromObjectWith
            @Override // kotlin.getMagicModuleStat
            public final Object write(Object obj2, Object obj3, Object obj4, Object obj5) {
                return canCreateUsingArrayDelegate.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (_reportMissingSetter) obj2, (getDataStream) obj3, (withValueDeserializer) obj4, (_findFormat) obj5);
            }
        };
        ValueInstantiators.AudioAttributesCompatParcelizer(caninstantiate, deserializewithobjectid.onPrepareFromSearch());
        _findPropertyUnwrapper _findpropertyunwrapperOnRemoveQueueItemAt = deserializewithobjectid.onRemoveQueueItemAt();
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((AbstractDeserializer.AudioAttributesCompatParcelizer) obj).IconCompatParcelizer() instanceof _findPropertyUnwrapper) {
                break;
            } else {
                i++;
            }
        }
        _findPropertyUnwrapper _findpropertyunwrapperRemoteActionCompatParcelizer = ValueInstantiators.RemoteActionCompatParcelizer(caninstantiate, _findpropertyunwrapperOnRemoveQueueItemAt, getmagicmodulestat, buffermapproperty, obj != null);
        if (_findpropertyunwrapperRemoteActionCompatParcelizer != null) {
            int size2 = this.RemoteActionCompatParcelizer.size() + 1;
            ArrayList arrayList = new ArrayList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                if (i2 == 0) {
                    audioAttributesCompatParcelizer = new AbstractDeserializer.AudioAttributesCompatParcelizer<>(_findpropertyunwrapperRemoteActionCompatParcelizer, 0, this.read.length());
                } else {
                    audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.get(i2 - 1);
                }
                arrayList.add(audioAttributesCompatParcelizer);
            }
            list3 = arrayList;
        } else {
            list3 = this.RemoteActionCompatParcelizer;
        }
        CharSequence charSequenceWrite = canCreateUsingDelegate.write(this.read, this.AudioAttributesImplApi26Parcelizer.getTextSize(), this.AudioAttributesCompatParcelizer, list3, this.write, this.MediaBrowserCompatItemReceiver, getmagicmodulestat, this.MediaBrowserCompatMediaItem);
        this.AudioAttributesImplBaseParcelizer = charSequenceWrite;
        this.MediaBrowserCompatCustomActionResultReceiver = new addIncludable(charSequenceWrite, this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final deserializeWithObjectId getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final canInstantiate getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final CharSequence getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final addIncludable getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final float write() {
        return this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final float RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.write();
    }

    @Override // kotlin._findCustomBeanDeserializer
    public final boolean AudioAttributesCompatParcelizer() {
        getDefaultCreator getdefaultcreator = this.MediaMetadataCompat;
        if (getdefaultcreator == null || !getdefaultcreator.read()) {
            return !this.MediaBrowserCompatMediaItem && createFromBoolean.IconCompatParcelizer(this.AudioAttributesCompatParcelizer) && createUsingDefault.INSTANCE.IconCompatParcelizer().getRemoteActionCompatParcelizer().booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface RemoteActionCompatParcelizer(canCreateUsingArrayDelegate cancreateusingarraydelegate, _reportMissingSetter _reportmissingsetter, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat) {
        parseDouble<Object> parsedoubleRemoteActionCompatParcelizer = cancreateusingarraydelegate.IconCompatParcelizer.RemoteActionCompatParcelizer(_reportmissingsetter, getdatastream, withvaluedeserializer.getIconCompatParcelizer(), _findformat.getRead());
        if (!(parsedoubleRemoteActionCompatParcelizer instanceof _findCachedDeserializer.RemoteActionCompatParcelizer)) {
            getDefaultCreator getdefaultcreator = new getDefaultCreator(parsedoubleRemoteActionCompatParcelizer, cancreateusingarraydelegate.MediaMetadataCompat);
            cancreateusingarraydelegate.MediaMetadataCompat = getdefaultcreator;
            return getdefaultcreator.IconCompatParcelizer();
        }
        Object remoteActionCompatParcelizer = ((_findCachedDeserializer.RemoteActionCompatParcelizer) parsedoubleRemoteActionCompatParcelizer).getRemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        return (Typeface) remoteActionCompatParcelizer;
    }
}
