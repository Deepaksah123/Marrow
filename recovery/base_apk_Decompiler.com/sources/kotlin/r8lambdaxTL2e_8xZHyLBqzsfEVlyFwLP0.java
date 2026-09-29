package kotlin;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\b&\u0018\u0000 \u00162\u00020\u0001:\u0003\t\u0016\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\t\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u001b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0010\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0016\u0010\u001eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001d¢\u0006\u0004\b\u0011\u0010\u001eJI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b\u0016\u0010!JQ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\"2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0004\b\u0011\u0010#J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010$J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010$R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010-\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&"}, d2 = {"Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;", "", "<init>", "()V", "", "p0", "", "p1", "", "write", "(ILjava/lang/String;)V", "O", "", "AudioAttributesCompatParcelizer", "(ILjava/lang/Object;)Z", "Landroid/content/Intent;", "p2", "IconCompatParcelizer", "(IILandroid/content/Intent;)Z", "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0$write;", "p3", "(Ljava/lang/String;ILandroid/content/Intent;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0$write;)V", "read", "()I", "I", "Lo/accessaddObserverForBackInvoker;", "Lo/_checkFloatToStringCoercion;", "RemoteActionCompatParcelizer", "(ILo/accessaddObserverForBackInvoker;Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "(Ljava/lang/String;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/hasGetter;", "(Ljava/lang/String;Lo/hasGetter;Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "(Ljava/lang/String;)V", "", "Ljava/util/Map;", "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0$IconCompatParcelizer;", "", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "Landroid/os/Bundle;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 {
    private static final read read = new read(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Map<Integer, String> MediaBrowserCompatCustomActionResultReceiver = new LinkedHashMap();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Integer> RemoteActionCompatParcelizer = new LinkedHashMap();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, IconCompatParcelizer> read = new LinkedHashMap();
    private final List<String> AudioAttributesCompatParcelizer = new ArrayList();
    private final transient Map<String, write<?>> write = new LinkedHashMap();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Map<String, Object> IconCompatParcelizer = new LinkedHashMap();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Bundle AudioAttributesImplApi26Parcelizer = new Bundle();

    public abstract <I, O> void RemoteActionCompatParcelizer(int p0, accessaddObserverForBackInvoker<I, O> p1, I p2, _checkFloatToStringCoercion p3);

    public final <I, O> r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> IconCompatParcelizer(final String p0, hasGetter p1, final accessaddObserverForBackInvoker<I, O> p2, final r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        anyIgnorals lifecycle = p1.getLifecycle();
        if (lifecycle.read().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(p1);
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle.read());
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        AudioAttributesCompatParcelizer(p0);
        IconCompatParcelizer iconCompatParcelizer = this.read.get(p0);
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = new IconCompatParcelizer(lifecycle);
        }
        iconCompatParcelizer.write(new findAccess() { // from class: o._init_lambda2
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.write(this.write, p0, p3, p2, hasgetter, readVar);
            }
        });
        this.read.put(p0, iconCompatParcelizer);
        return new AudioAttributesCompatParcelizer(p0, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0, String str, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, accessaddObserverForBackInvoker accessaddobserverforbackinvoker, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, "");
        toMagicModuleMetaRepoModel.write(accessaddobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (anyIgnorals.read.ON_START == readVar) {
            r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.write.put(str, new write<>(r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, accessaddobserverforbackinvoker));
            if (r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.IconCompatParcelizer.containsKey(str)) {
                Object obj = r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.IconCompatParcelizer.get(str);
                r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.IconCompatParcelizer.remove(str);
                r8lambdaci7dwlt0wnpzj9a3orpjguf1usm.IconCompatParcelizer(obj);
            }
            ActivityResult activityResult = (ActivityResult) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.AudioAttributesImplApi26Parcelizer, str, ActivityResult.class);
            if (activityResult != null) {
                r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.AudioAttributesImplApi26Parcelizer.remove(str);
                r8lambdaci7dwlt0wnpzj9a3orpjguf1usm.IconCompatParcelizer(accessaddobserverforbackinvoker.AudioAttributesCompatParcelizer(activityResult.getRemoteActionCompatParcelizer(), activityResult.getRead()));
                return;
            }
            return;
        }
        if (anyIgnorals.read.ON_STOP == readVar) {
            r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.write.remove(str);
        } else if (anyIgnorals.read.ON_DESTROY == readVar) {
            r8lambdaxtl2e_8xzhylbqzsfevlyfwlp0.IconCompatParcelizer(str);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public static final class AudioAttributesCompatParcelizer<I> extends r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> {
        final /* synthetic */ accessaddObserverForBackInvoker<I, O> read;
        final /* synthetic */ String write;

        AudioAttributesCompatParcelizer(String str, accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker) {
            this.write = str;
            this.read = accessaddobserverforbackinvoker;
        }

        @Override // kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
        public final void RemoteActionCompatParcelizer(I i, _checkFloatToStringCoercion _checkfloattostringcoercion) throws Exception {
            Object obj = r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.RemoteActionCompatParcelizer.get(this.write);
            Object obj2 = this.read;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.AudioAttributesCompatParcelizer.add(this.write);
                try {
                    r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.RemoteActionCompatParcelizer(iIntValue, this.read, i, _checkfloattostringcoercion);
                    return;
                } catch (Exception e) {
                    r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.AudioAttributesCompatParcelizer.remove(this.write);
                    throw e;
                }
            }
            StringBuilder sb = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sb.append(obj2);
            sb.append(" and input ");
            sb.append(i);
            sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sb.toString().toString());
        }

        @Override // kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
        public final void RemoteActionCompatParcelizer() {
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.IconCompatParcelizer(this.write);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> read(String p0, accessaddObserverForBackInvoker<I, O> p1, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        AudioAttributesCompatParcelizer(p0);
        this.write.put(p0, new write<>(p2, p1));
        if (this.IconCompatParcelizer.containsKey(p0)) {
            Object obj = this.IconCompatParcelizer.get(p0);
            this.IconCompatParcelizer.remove(p0);
            p2.IconCompatParcelizer(obj);
        }
        ActivityResult activityResult = (ActivityResult) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0, ActivityResult.class);
        if (activityResult != null) {
            this.AudioAttributesImplApi26Parcelizer.remove(p0);
            p2.IconCompatParcelizer(p1.AudioAttributesCompatParcelizer(activityResult.getRemoteActionCompatParcelizer(), activityResult.getRead()));
        }
        return new RemoteActionCompatParcelizer(p0, p1);
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public static final class RemoteActionCompatParcelizer<I> extends r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> {
        final /* synthetic */ accessaddObserverForBackInvoker<I, O> RemoteActionCompatParcelizer;
        final /* synthetic */ String write;

        RemoteActionCompatParcelizer(String str, accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker) {
            this.write = str;
            this.RemoteActionCompatParcelizer = accessaddobserverforbackinvoker;
        }

        @Override // kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
        public final void RemoteActionCompatParcelizer(I i, _checkFloatToStringCoercion _checkfloattostringcoercion) throws Exception {
            Object obj = r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.RemoteActionCompatParcelizer.get(this.write);
            Object obj2 = this.RemoteActionCompatParcelizer;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.AudioAttributesCompatParcelizer.add(this.write);
                try {
                    r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.RemoteActionCompatParcelizer(iIntValue, this.RemoteActionCompatParcelizer, i, _checkfloattostringcoercion);
                    return;
                } catch (Exception e) {
                    r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.AudioAttributesCompatParcelizer.remove(this.write);
                    throw e;
                }
            }
            StringBuilder sb = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sb.append(obj2);
            sb.append(" and input ");
            sb.append(i);
            sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sb.toString().toString());
        }

        @Override // kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
        public final void RemoteActionCompatParcelizer() {
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.this.IconCompatParcelizer(this.write);
        }
    }

    public final void IconCompatParcelizer(String p0) {
        Integer numRemove;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!this.AudioAttributesCompatParcelizer.contains(p0) && (numRemove = this.RemoteActionCompatParcelizer.remove(p0)) != null) {
            this.MediaBrowserCompatCustomActionResultReceiver.remove(numRemove);
        }
        this.write.remove(p0);
        if (this.IconCompatParcelizer.containsKey(p0)) {
            Objects.toString(this.IconCompatParcelizer.get(p0));
            this.IconCompatParcelizer.remove(p0);
        }
        if (this.AudioAttributesImplApi26Parcelizer.containsKey(p0)) {
            Objects.toString((ActivityResult) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0, ActivityResult.class));
            this.AudioAttributesImplApi26Parcelizer.remove(p0);
        }
        IconCompatParcelizer iconCompatParcelizer = this.read.get(p0);
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read();
            this.read.remove(p0);
        }
    }

    public final void IconCompatParcelizer(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.RemoteActionCompatParcelizer.values()));
        p0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.RemoteActionCompatParcelizer.keySet()));
        p0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.AudioAttributesCompatParcelizer));
        p0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.AudioAttributesImplApi26Parcelizer));
    }

    public final void read(Bundle p0) {
        if (p0 != null) {
            ArrayList<Integer> integerArrayList = p0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = p0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = p0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                this.AudioAttributesCompatParcelizer.addAll(stringArrayList2);
            }
            Bundle bundle = p0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                this.AudioAttributesImplApi26Parcelizer.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (this.RemoteActionCompatParcelizer.containsKey(str)) {
                    Integer numRemove = this.RemoteActionCompatParcelizer.remove(str);
                    if (!this.AudioAttributesImplApi26Parcelizer.containsKey(str)) {
                        toMagicModuleStatsLSModel.write(this.MediaBrowserCompatCustomActionResultReceiver).remove(numRemove);
                    }
                }
                Integer num = integerArrayList.get(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
                int iIntValue = num.intValue();
                String str2 = stringArrayList.get(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                write(iIntValue, str2);
            }
        }
    }

    public final boolean IconCompatParcelizer(int p0, int p1, Intent p2) {
        String str = this.MediaBrowserCompatCustomActionResultReceiver.get(Integer.valueOf(p0));
        if (str == null) {
            return false;
        }
        write(str, p1, p2, this.write.get(str));
        return true;
    }

    public final <O> boolean AudioAttributesCompatParcelizer(int p0, O p1) {
        String str = this.MediaBrowserCompatCustomActionResultReceiver.get(Integer.valueOf(p0));
        if (str == null) {
            return false;
        }
        write<?> writeVar = this.write.get(str);
        if ((writeVar != null ? writeVar.IconCompatParcelizer() : null) == null) {
            this.AudioAttributesImplApi26Parcelizer.remove(str);
            this.IconCompatParcelizer.put(str, p1);
            return true;
        }
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<?> r8lambdaci7dwlt0wnpzj9a3orpjguf1usmIconCompatParcelizer = writeVar.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(r8lambdaci7dwlt0wnpzj9a3orpjguf1usmIconCompatParcelizer, "");
        if (!this.AudioAttributesCompatParcelizer.remove(str)) {
            return true;
        }
        r8lambdaci7dwlt0wnpzj9a3orpjguf1usmIconCompatParcelizer.IconCompatParcelizer(p1);
        return true;
    }

    private final <O> void write(String p0, int p1, Intent p2, write<O> p3) {
        if ((p3 != null ? p3.IconCompatParcelizer() : null) != null && this.AudioAttributesCompatParcelizer.contains(p0)) {
            p3.IconCompatParcelizer().IconCompatParcelizer(p3.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(p1, p2));
            this.AudioAttributesCompatParcelizer.remove(p0);
        } else {
            this.IconCompatParcelizer.remove(p0);
            this.AudioAttributesImplApi26Parcelizer.putParcelable(p0, new ActivityResult(p1, p2));
        }
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        if (this.RemoteActionCompatParcelizer.get(p0) != null) {
            return;
        }
        write(read(), p0);
    }

    /* JADX INFO: renamed from: o.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(getFinalData.INSTANCE.read(2147418112) + C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }

        AnonymousClass1() {
            super(0);
        }
    }

    private final int read() {
        Iterator itWrite = StateResult.IconCompatParcelizer((getCreatedOnDateMs) AnonymousClass1.write).write();
        while (itWrite.hasNext()) {
            Number number = (Number) itWrite.next();
            if (!this.MediaBrowserCompatCustomActionResultReceiver.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void write(int p0, String p1) {
        this.MediaBrowserCompatCustomActionResultReceiver.put(Integer.valueOf(p0), p1);
        this.RemoteActionCompatParcelizer.put(p1, Integer.valueOf(p0));
    }

    static final class write<O> {
        private final accessaddObserverForBackInvoker<?, O> AudioAttributesCompatParcelizer;
        private final r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> read;

        public write(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, accessaddObserverForBackInvoker<?, O> accessaddobserverforbackinvoker) {
            toMagicModuleMetaRepoModel.write(r8lambdaci7dwlt0wnpzj9a3orpjguf1usm, "");
            toMagicModuleMetaRepoModel.write(accessaddobserverforbackinvoker, "");
            this.read = r8lambdaci7dwlt0wnpzj9a3orpjguf1usm;
            this.AudioAttributesCompatParcelizer = accessaddobserverforbackinvoker;
        }

        public final r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> IconCompatParcelizer() {
            return this.read;
        }

        public final accessaddObserverForBackInvoker<?, O> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    static final class IconCompatParcelizer {
        private final List<findAccess> RemoteActionCompatParcelizer;
        private final anyIgnorals read;

        public IconCompatParcelizer(anyIgnorals anyignorals) {
            toMagicModuleMetaRepoModel.write(anyignorals, "");
            this.read = anyignorals;
            this.RemoteActionCompatParcelizer = new ArrayList();
        }

        public final void write(findAccess findaccess) {
            toMagicModuleMetaRepoModel.write(findaccess, "");
            this.read.IconCompatParcelizer(findaccess);
            this.RemoteActionCompatParcelizer.add(findaccess);
        }

        public final void read() {
            Iterator<T> it = this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                this.read.AudioAttributesCompatParcelizer((findAccess) it.next());
            }
            this.RemoteActionCompatParcelizer.clear();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0$read;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
