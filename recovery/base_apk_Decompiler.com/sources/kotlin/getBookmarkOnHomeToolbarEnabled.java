package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.getDefaultBottomTab;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0019\u0015BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u0017\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!"}, d2 = {"Lo/getBookmarkOnHomeToolbarEnabled;", "Lo/getDefaultBottomTab;", "", "Ljava/lang/Class;", "p0", "", "", "p1", "Lo/getBookmarkOnHomeToolbarEnabled$read;", "p2", "Lo/getBookmarkOnHomeToolbarEnabled$write;", "p3", "Ljava/lang/reflect/Method;", "p4", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lo/getBookmarkOnHomeToolbarEnabled$read;Lo/getBookmarkOnHomeToolbarEnabled$write;Ljava/util/List;)V", "", "", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;)Ljava/lang/Object;", "Lo/getBookmarkOnHomeToolbarEnabled$read;", "write", "Ljava/util/List;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Ljava/lang/Class;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/reflect/Type;", "AudioAttributesImplBaseParcelizer", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/reflect/Type;", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getBookmarkOnHomeToolbarEnabled implements getDefaultBottomTab {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<Class<?>> read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<String> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final List<Type> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<Method> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final read write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Class<?> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<Object> IconCompatParcelizer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getBookmarkOnHomeToolbarEnabled$read;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum read {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getBookmarkOnHomeToolbarEnabled$write;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum write {
        JAVA,
        KOTLIN
    }

    @Override // kotlin.getDefaultBottomTab
    public final /* synthetic */ Member write() {
        return null;
    }

    public getBookmarkOnHomeToolbarEnabled(Class<?> cls, List<String> list, read readVar, write writeVar, List<Method> list2) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.RemoteActionCompatParcelizer = cls;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.write = readVar;
        this.AudioAttributesCompatParcelizer = list2;
        List<Method> list3 = list2;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.AudioAttributesImplApi26Parcelizer = arrayList;
        List<Method> list4 = this.AudioAttributesCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
            Class<?> clsMediaBrowserCompatCustomActionResultReceiver = getFinalImageUrl.MediaBrowserCompatCustomActionResultReceiver(returnType);
            if (clsMediaBrowserCompatCustomActionResultReceiver != null) {
                returnType = clsMediaBrowserCompatCustomActionResultReceiver;
            }
            arrayList2.add(returnType);
        }
        this.read = arrayList2;
        List<Method> list5 = this.AudioAttributesCompatParcelizer;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.IconCompatParcelizer = arrayList3;
        if (this.write == read.POSITIONAL_CALL && writeVar == write.JAVA && !IntermediateLoginResponseBody.write(this.MediaBrowserCompatCustomActionResultReceiver, AppMeasurementSdk.ConditionalUserProperty.VALUE).isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    private void write(Object[] objArr) {
        getDefaultBottomTab.AudioAttributesCompatParcelizer.read(this, objArr);
    }

    public /* synthetic */ getBookmarkOnHomeToolbarEnabled(Class cls, List list, read readVar, write writeVar, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 16) != 0) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list2 = arrayList;
        }
        this(cls, list, readVar, writeVar, list2);
    }

    @Override // kotlin.getDefaultBottomTab
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final Type getWrite() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getDefaultBottomTab
    public final List<Type> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.getDefaultBottomTab
    public final Object RemoteActionCompatParcelizer(Object[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        write(p0);
        ArrayList arrayList = new ArrayList(p0.length);
        int length = p0.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = p0[i];
            Object objWrite = (obj == null && this.write == read.CALL_BY_NAME) ? this.IconCompatParcelizer.get(i2) : getDeeplinks.write(obj, this.read.get(i2));
            if (objWrite == null) {
                getDeeplinks.AudioAttributesCompatParcelizer(i2, this.MediaBrowserCompatCustomActionResultReceiver.get(i2), this.read.get(i2));
                throw null;
            }
            arrayList.add(objWrite);
            i++;
            i2++;
        }
        return getDeeplinks.read(this.RemoteActionCompatParcelizer, VideoTimelineResponseBody.read(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver, arrayList)), this.AudioAttributesCompatParcelizer);
    }
}
