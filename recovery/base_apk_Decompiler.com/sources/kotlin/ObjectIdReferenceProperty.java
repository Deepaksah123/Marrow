package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B_\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001d\u0010!R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001c\u0010!R\u0014\u0010\u0018\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010&\u0082\u0001\u0003()*"}, d2 = {"Lo/ObjectIdReferenceProperty;", "", "p0", "", "p1", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "p2", "p3", "Lo/appendReferring;", "p4", "", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lo/PropertyBasedCreatorCaseInsensitiveMap;Ljava/lang/Object;Lo/appendReferring;Ljava/util/Collection;Ljava/util/Collection;Z)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Ljava/lang/String;", "()Ljava/lang/String;", "write", "AudioAttributesImplApi21Parcelizer", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "IconCompatParcelizer", "()Lo/PropertyBasedCreatorCaseInsensitiveMap;", "read", "RemoteActionCompatParcelizer", "Lo/appendReferring;", "()Lo/appendReferring;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "MediaBrowserCompatItemReceiver", "Z", "", "Lo/getAbsentValue;", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getIdType;", "Lo/ObjectIdReferencePropertyPropertyReferring;", "Lo/findCreatorProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ObjectIdReferenceProperty {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final PropertyBasedCreatorCaseInsensitiveMap read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Collection<Object> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Collection<ObjectIdReferenceProperty> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final appendReferring IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private ObjectIdReferenceProperty(Object obj, String str, PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMap, Object obj2, appendReferring appendreferring, Collection<? extends Object> collection, Collection<? extends ObjectIdReferenceProperty> collection2, boolean z) {
        this.AudioAttributesCompatParcelizer = obj;
        this.write = str;
        this.read = propertyBasedCreatorCaseInsensitiveMap;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = appendreferring;
        this.MediaBrowserCompatItemReceiver = collection;
        this.AudioAttributesImplApi26Parcelizer = collection2;
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final PropertyBasedCreatorCaseInsensitiveMap getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final appendReferring getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Collection<Object> RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final Collection<ObjectIdReferenceProperty> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public List<getAbsentValue> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public /* synthetic */ ObjectIdReferenceProperty(Object obj, String str, PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMap, Object obj2, appendReferring appendreferring, Collection collection, Collection collection2, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj, str, propertyBasedCreatorCaseInsensitiveMap, obj2, appendreferring, collection, collection2, z);
    }
}
