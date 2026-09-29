package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.ObjectIdInfo;
import kotlin._constructStdTypeResolverBuilder;
import kotlin._renameUsing;

/* JADX INFO: loaded from: classes2.dex */
public final class _constructStdTypeResolverBuilder extends _renameUsing {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public _constructStdTypeResolverBuilder(ViewGroup viewGroup) {
        super(viewGroup);
        toMagicModuleMetaRepoModel.write(viewGroup, "");
    }

    @Override // kotlin._renameUsing
    public final void IconCompatParcelizer(List<? extends _renameUsing.RemoteActionCompatParcelizer> list, boolean z) {
        _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        Object next;
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            remoteActionCompatParcelizer = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (_renameUsing.RemoteActionCompatParcelizer) next;
            _renameUsing.RemoteActionCompatParcelizer.read.Companion companion = _renameUsing.RemoteActionCompatParcelizer.read.INSTANCE;
            View view = remoteActionCompatParcelizer2.write().mView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            if (_renameUsing.RemoteActionCompatParcelizer.read.Companion.IconCompatParcelizer(view) == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE && remoteActionCompatParcelizer2.read() != _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) {
                break;
            }
        }
        _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (_renameUsing.RemoteActionCompatParcelizer) next;
        ListIterator<? extends _renameUsing.RemoteActionCompatParcelizer> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizerPrevious = listIterator.previous();
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = remoteActionCompatParcelizerPrevious;
            _renameUsing.RemoteActionCompatParcelizer.read.Companion companion2 = _renameUsing.RemoteActionCompatParcelizer.read.INSTANCE;
            View view2 = remoteActionCompatParcelizer4.write().mView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            if (_renameUsing.RemoteActionCompatParcelizer.read.Companion.IconCompatParcelizer(view2) != _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE && remoteActionCompatParcelizer4.read() == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) {
                remoteActionCompatParcelizer = remoteActionCompatParcelizerPrevious;
                break;
            }
        }
        _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = remoteActionCompatParcelizer;
        if (FragmentManager.write(2)) {
            Objects.toString(remoteActionCompatParcelizer3);
            Objects.toString(remoteActionCompatParcelizer5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        RemoteActionCompatParcelizer(list);
        Iterator<? extends _renameUsing.RemoteActionCompatParcelizer> it2 = list.iterator();
        while (it2.hasNext()) {
            final _renameUsing.RemoteActionCompatParcelizer next2 = it2.next();
            arrayList.add(new AudioAttributesCompatParcelizer(next2, z));
            arrayList2.add(new MediaBrowserCompatCustomActionResultReceiver(next2, z, !z ? next2 != remoteActionCompatParcelizer5 : next2 != remoteActionCompatParcelizer3));
            next2.RemoteActionCompatParcelizer(new Runnable() { // from class: o._constructNoTypeResolverBuilder
                @Override // java.lang.Runnable
                public final void run() {
                    _constructStdTypeResolverBuilder.read(this.read, next2);
                }
            });
        }
        RemoteActionCompatParcelizer(arrayList2, z, remoteActionCompatParcelizer3, remoteActionCompatParcelizer5);
        write(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(_constructStdTypeResolverBuilder _constructstdtyperesolverbuilder, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(_constructstdtyperesolverbuilder, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        _constructstdtyperesolverbuilder.write(remoteActionCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(List<? extends _renameUsing.RemoteActionCompatParcelizer> list) {
        Fragment fragmentWrite = ((_renameUsing.RemoteActionCompatParcelizer) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).write();
        for (_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
            remoteActionCompatParcelizer.write().mAnimationInfo.RemoteActionCompatParcelizer = fragmentWrite.mAnimationInfo.RemoteActionCompatParcelizer;
            remoteActionCompatParcelizer.write().mAnimationInfo.AudioAttributesImplApi26Parcelizer = fragmentWrite.mAnimationInfo.AudioAttributesImplApi26Parcelizer;
            remoteActionCompatParcelizer.write().mAnimationInfo.MediaDescriptionCompat = fragmentWrite.mAnimationInfo.MediaDescriptionCompat;
            remoteActionCompatParcelizer.write().mAnimationInfo.MediaBrowserCompatSearchResultReceiver = fragmentWrite.mAnimationInfo.MediaBrowserCompatSearchResultReceiver;
        }
    }

    private final void write(List<AudioAttributesCompatParcelizer> list) {
        ArrayList<AudioAttributesCompatParcelizer> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) ((AudioAttributesCompatParcelizer) it.next()).read().IconCompatParcelizer());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = false;
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : list) {
            Context context = getRead().getContext();
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = audioAttributesCompatParcelizer.read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            ObjectIdInfo.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(context);
            if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
                if (remoteActionCompatParcelizerIconCompatParcelizer.write == null) {
                    arrayList.add(audioAttributesCompatParcelizer);
                } else {
                    Fragment fragmentWrite = remoteActionCompatParcelizer.write();
                    if (!remoteActionCompatParcelizer.IconCompatParcelizer().isEmpty()) {
                        if (FragmentManager.write(2)) {
                            Objects.toString(fragmentWrite);
                        }
                    } else {
                        if (remoteActionCompatParcelizer.read() == _renameUsing.RemoteActionCompatParcelizer.read.GONE) {
                            remoteActionCompatParcelizer.MediaDescriptionCompat();
                        }
                        remoteActionCompatParcelizer.write(new read(audioAttributesCompatParcelizer));
                        z = true;
                    }
                }
            }
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : arrayList) {
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = audioAttributesCompatParcelizer2.read();
            Fragment fragmentWrite2 = remoteActionCompatParcelizer2.write();
            if (zIsEmpty) {
                if (z) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(fragmentWrite2);
                    }
                } else {
                    remoteActionCompatParcelizer2.write(new IconCompatParcelizer(audioAttributesCompatParcelizer2));
                }
            } else if (FragmentManager.write(2)) {
                Objects.toString(fragmentWrite2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RemoteActionCompatParcelizer(List<MediaBrowserCompatCustomActionResultReceiver> list, boolean z, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        _removeUnwantedAccessor _removeunwantedaccessor;
        Pair pairWrite;
        String strRemoteActionCompatParcelizer;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!((MediaBrowserCompatCustomActionResultReceiver) obj).AudioAttributesCompatParcelizer()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((MediaBrowserCompatCustomActionResultReceiver) obj2).IconCompatParcelizer() != null) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList<MediaBrowserCompatCustomActionResultReceiver> arrayList6 = arrayList5;
        _removeUnwantedAccessor _removeunwantedaccessor2 = null;
        for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : arrayList6) {
            _removeUnwantedAccessor _removeunwantedaccessorIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            if (_removeunwantedaccessor2 != null && _removeunwantedaccessorIconCompatParcelizer != _removeunwantedaccessor2) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(mediaBrowserCompatCustomActionResultReceiver.read().write());
                sb.append(" returned Transition ");
                sb.append(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            _removeunwantedaccessor2 = _removeunwantedaccessorIconCompatParcelizer;
        }
        if (_removeunwantedaccessor2 != null) {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            setTitleOptional settitleoptional = new setTitleOptional();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            setTitleOptional settitleoptional2 = new setTitleOptional();
            setTitleOptional settitleoptional3 = new setTitleOptional();
            Iterator it2 = arrayList5.iterator();
            Object objRemoteActionCompatParcelizer = null;
            while (it2.hasNext()) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = (MediaBrowserCompatCustomActionResultReceiver) it2.next();
                if (!mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesImplApi26Parcelizer() || remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null) {
                    arrayList = arrayList6;
                    it = it2;
                    arrayList2 = arrayList5;
                    _removeunwantedaccessor = _removeunwantedaccessor2;
                } else {
                    objRemoteActionCompatParcelizer = _removeunwantedaccessor2.RemoteActionCompatParcelizer(_removeunwantedaccessor2.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver2.write()));
                    arrayList10 = remoteActionCompatParcelizer2.write().getSharedElementSourceNames();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayList10, "");
                    ArrayList<String> sharedElementSourceNames = remoteActionCompatParcelizer.write().getSharedElementSourceNames();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedElementSourceNames, "");
                    ArrayList<String> sharedElementTargetNames = remoteActionCompatParcelizer.write().getSharedElementTargetNames();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedElementTargetNames, "");
                    int size = sharedElementTargetNames.size();
                    it = it2;
                    int i = 0;
                    while (i < size) {
                        int i2 = size;
                        int iIndexOf = arrayList10.indexOf(sharedElementTargetNames.get(i));
                        ArrayList<String> arrayList11 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            arrayList10.set(iIndexOf, sharedElementSourceNames.get(i));
                        }
                        i++;
                        size = i2;
                        sharedElementTargetNames = arrayList11;
                    }
                    ArrayList<String> sharedElementTargetNames2 = remoteActionCompatParcelizer2.write().getSharedElementTargetNames();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedElementTargetNames2, "");
                    if (!z) {
                        pairWrite = setAction.write(remoteActionCompatParcelizer.write().getExitTransitionCallback(), remoteActionCompatParcelizer2.write().getEnterTransitionCallback());
                    } else {
                        pairWrite = setAction.write(remoteActionCompatParcelizer.write().getEnterTransitionCallback(), remoteActionCompatParcelizer2.write().getExitTransitionCallback());
                    }
                    _intOverflow _intoverflow = (_intOverflow) pairWrite.RemoteActionCompatParcelizer();
                    _intOverflow _intoverflow2 = (_intOverflow) pairWrite.read();
                    int size2 = arrayList10.size();
                    _removeunwantedaccessor = _removeunwantedaccessor2;
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = size2;
                        String str = arrayList10.get(i3);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                        ArrayList arrayList12 = arrayList5;
                        String str2 = sharedElementTargetNames2.get(i3);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                        settitleoptional.put(str, str2);
                        i3++;
                        size2 = i4;
                        arrayList5 = arrayList12;
                        arrayList6 = arrayList6;
                    }
                    arrayList = arrayList6;
                    arrayList2 = arrayList5;
                    if (FragmentManager.write(2)) {
                        for (String str3 : sharedElementTargetNames2) {
                        }
                        for (String str4 : arrayList10) {
                        }
                    }
                    View view = remoteActionCompatParcelizer.write().mView;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                    RemoteActionCompatParcelizer(settitleoptional2, view);
                    settitleoptional2.IconCompatParcelizer((Collection<?>) arrayList10);
                    if (_intoverflow != null) {
                        if (FragmentManager.write(2)) {
                            Objects.toString(remoteActionCompatParcelizer);
                        }
                        int size3 = arrayList10.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i5 = size3 - 1;
                                String str5 = arrayList10.get(size3);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
                                String str6 = str5;
                                View view2 = (View) settitleoptional2.get(str6);
                                if (view2 == null) {
                                    settitleoptional.remove(str6);
                                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str6, (Object) InvalidTypeIdException.onMediaButtonEvent(view2))) {
                                    settitleoptional.put(InvalidTypeIdException.onMediaButtonEvent(view2), (String) settitleoptional.remove(str6));
                                }
                                if (i5 < 0) {
                                    break;
                                } else {
                                    size3 = i5;
                                }
                            }
                        }
                    } else {
                        settitleoptional.IconCompatParcelizer((Collection<?>) settitleoptional2.keySet());
                    }
                    View view3 = remoteActionCompatParcelizer2.write().mView;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
                    RemoteActionCompatParcelizer(settitleoptional3, view3);
                    settitleoptional3.IconCompatParcelizer((Collection<?>) sharedElementTargetNames2);
                    settitleoptional3.IconCompatParcelizer(settitleoptional.values());
                    if (_intoverflow2 != null) {
                        if (FragmentManager.write(2)) {
                            Objects.toString(remoteActionCompatParcelizer2);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                String str7 = sharedElementTargetNames2.get(size4);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
                                String str8 = str7;
                                View view4 = (View) settitleoptional3.get(str8);
                                if (view4 == null) {
                                    String strRemoteActionCompatParcelizer2 = _collectIgnorals.RemoteActionCompatParcelizer((setTitleOptional<String, String>) settitleoptional, str8);
                                    if (strRemoteActionCompatParcelizer2 != null) {
                                        settitleoptional.remove(strRemoteActionCompatParcelizer2);
                                    }
                                } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str8, (Object) InvalidTypeIdException.onMediaButtonEvent(view4)) && (strRemoteActionCompatParcelizer = _collectIgnorals.RemoteActionCompatParcelizer((setTitleOptional<String, String>) settitleoptional, str8)) != null) {
                                    settitleoptional.put(strRemoteActionCompatParcelizer, InvalidTypeIdException.onMediaButtonEvent(view4));
                                }
                                if (i6 < 0) {
                                    break;
                                } else {
                                    size4 = i6;
                                }
                            }
                        }
                    } else {
                        _collectIgnorals.RemoteActionCompatParcelizer((setTitleOptional<String, String>) settitleoptional, (setTitleOptional<String, View>) settitleoptional3);
                    }
                    Set setKeySet = settitleoptional.keySet();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
                    IconCompatParcelizer((setTitleOptional<String, View>) settitleoptional2, setKeySet);
                    Collection collectionValues = settitleoptional.values();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
                    IconCompatParcelizer((setTitleOptional<String, View>) settitleoptional3, (Collection<String>) collectionValues);
                    if (settitleoptional.isEmpty()) {
                        Objects.toString(objRemoteActionCompatParcelizer);
                        Objects.toString(remoteActionCompatParcelizer);
                        Objects.toString(remoteActionCompatParcelizer2);
                        arrayList7.clear();
                        arrayList8.clear();
                        arrayList9 = sharedElementTargetNames2;
                        objRemoteActionCompatParcelizer = null;
                    } else {
                        arrayList9 = sharedElementTargetNames2;
                    }
                }
                it2 = it;
                _removeunwantedaccessor2 = _removeunwantedaccessor;
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
            }
            ArrayList arrayList13 = arrayList6;
            ArrayList arrayList14 = arrayList5;
            _removeUnwantedAccessor _removeunwantedaccessor3 = _removeunwantedaccessor2;
            if (objRemoteActionCompatParcelizer == null) {
                if (arrayList13.isEmpty()) {
                    return;
                }
                Iterator it3 = arrayList13.iterator();
                while (it3.hasNext()) {
                    if (((MediaBrowserCompatCustomActionResultReceiver) it3.next()).RemoteActionCompatParcelizer() == null) {
                    }
                }
                return;
            }
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer(arrayList14, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, _removeunwantedaccessor3, objRemoteActionCompatParcelizer, arrayList7, arrayList8, settitleoptional, arrayList9, arrayList10, settitleoptional2, settitleoptional3, z);
            Iterator it4 = arrayList13.iterator();
            while (it4.hasNext()) {
                ((MediaBrowserCompatCustomActionResultReceiver) it4.next()).read().write(audioAttributesImplApi21Parcelizer);
            }
        }
    }

    /* JADX INFO: renamed from: o._constructStdTypeResolverBuilder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006*\u00020\u00010\u0001\u0012\b\u0012\u0006*\u00020\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Landroid/view/View;", "p0", "", "IconCompatParcelizer", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Map.Entry<String, View>, Boolean> {
        final /* synthetic */ Collection<String> $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            toMagicModuleMetaRepoModel.write(entry, "");
            return Boolean.valueOf(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(this.$IconCompatParcelizer, InvalidTypeIdException.onMediaButtonEvent(entry.getValue())));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Collection<String> collection) {
            super(1);
            this.$IconCompatParcelizer = collection;
        }
    }

    private static void IconCompatParcelizer(setTitleOptional<String, View> settitleoptional, Collection<String> collection) {
        Set<Map.Entry<String, View>> setEntrySet = settitleoptional.entrySet();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setEntrySet, "");
        IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) setEntrySet, (getAnswerMap) new AnonymousClass1(collection));
    }

    private final void RemoteActionCompatParcelizer(Map<String, View> map, View view) {
        String strOnMediaButtonEvent = InvalidTypeIdException.onMediaButtonEvent(view);
        if (strOnMediaButtonEvent != null) {
            map.put(strOnMediaButtonEvent, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
                    RemoteActionCompatParcelizer(map, childAt);
                }
            }
        }
    }

    public static class AudioAttributesImplApi26Parcelizer {
        private final _renameUsing.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;

        public AudioAttributesImplApi26Parcelizer(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        public final _renameUsing.RemoteActionCompatParcelizer read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            _renameUsing.RemoteActionCompatParcelizer.read readVarIconCompatParcelizer;
            View view = this.AudioAttributesCompatParcelizer.write().mView;
            if (view != null) {
                _renameUsing.RemoteActionCompatParcelizer.read.Companion companion = _renameUsing.RemoteActionCompatParcelizer.read.INSTANCE;
                readVarIconCompatParcelizer = _renameUsing.RemoteActionCompatParcelizer.read.Companion.IconCompatParcelizer(view);
            } else {
                readVarIconCompatParcelizer = null;
            }
            _renameUsing.RemoteActionCompatParcelizer.read readVar = this.AudioAttributesCompatParcelizer.read();
            if (readVarIconCompatParcelizer != readVar) {
                return (readVarIconCompatParcelizer == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE || readVar == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) ? false : true;
            }
            return true;
        }
    }

    static final class AudioAttributesCompatParcelizer extends AudioAttributesImplApi26Parcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private ObjectIdInfo.RemoteActionCompatParcelizer IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            super(remoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = z;
        }

        public final ObjectIdInfo.RemoteActionCompatParcelizer IconCompatParcelizer(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            if (this.AudioAttributesCompatParcelizer) {
                return this.IconCompatParcelizer;
            }
            ObjectIdInfo.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = ObjectIdInfo.write(context, read().write(), read().read() == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE, this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer = remoteActionCompatParcelizerWrite;
            this.AudioAttributesCompatParcelizer = true;
            return remoteActionCompatParcelizerWrite;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplApi26Parcelizer {
        private final Object AudioAttributesCompatParcelizer;
        private final Object IconCompatParcelizer;
        private final boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatCustomActionResultReceiver(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z, boolean z2) {
            Object returnTransition;
            boolean allowEnterTransitionOverlap;
            Object sharedElementEnterTransition;
            super(remoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            if (remoteActionCompatParcelizer.read() == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) {
                Fragment fragmentWrite = remoteActionCompatParcelizer.write();
                returnTransition = z ? fragmentWrite.getReenterTransition() : fragmentWrite.getEnterTransition();
            } else {
                Fragment fragmentWrite2 = remoteActionCompatParcelizer.write();
                returnTransition = z ? fragmentWrite2.getReturnTransition() : fragmentWrite2.getExitTransition();
            }
            this.IconCompatParcelizer = returnTransition;
            if (remoteActionCompatParcelizer.read() != _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) {
                allowEnterTransitionOverlap = true;
            } else if (z) {
                allowEnterTransitionOverlap = remoteActionCompatParcelizer.write().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = remoteActionCompatParcelizer.write().getAllowEnterTransitionOverlap();
            }
            this.write = allowEnterTransitionOverlap;
            if (!z2) {
                sharedElementEnterTransition = null;
            } else if (z) {
                sharedElementEnterTransition = remoteActionCompatParcelizer.write().getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = remoteActionCompatParcelizer.write().getSharedElementEnterTransition();
            }
            this.AudioAttributesCompatParcelizer = sharedElementEnterTransition;
        }

        public final Object RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            return this.write;
        }

        public final Object write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesCompatParcelizer != null;
        }

        public final _removeUnwantedAccessor IconCompatParcelizer() {
            _removeUnwantedAccessor _removeunwantedaccessorIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer);
            _removeUnwantedAccessor _removeunwantedaccessorIconCompatParcelizer2 = IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            if (_removeunwantedaccessorIconCompatParcelizer == null || _removeunwantedaccessorIconCompatParcelizer2 == null || _removeunwantedaccessorIconCompatParcelizer == _removeunwantedaccessorIconCompatParcelizer2) {
                return _removeunwantedaccessorIconCompatParcelizer == null ? _removeunwantedaccessorIconCompatParcelizer2 : _removeunwantedaccessorIconCompatParcelizer;
            }
            StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(read().write());
            sb.append(" returned Transition ");
            sb.append(this.IconCompatParcelizer);
            sb.append(" which uses a different Transition  type than its shared element transition ");
            sb.append(this.AudioAttributesCompatParcelizer);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        private final _removeUnwantedAccessor IconCompatParcelizer(Object obj) {
            if (obj == null) {
                return null;
            }
            if (_collectIgnorals.RemoteActionCompatParcelizer != null && _collectIgnorals.RemoteActionCompatParcelizer.read(obj)) {
                return _collectIgnorals.RemoteActionCompatParcelizer;
            }
            if (_collectIgnorals.write != null && _collectIgnorals.write.read(obj)) {
                return _collectIgnorals.write;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(read().write());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static final class IconCompatParcelizer extends _renameUsing.write {
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o._renameUsing.write
        public final void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
                return;
            }
            Context context = viewGroup.getContext();
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            View view = remoteActionCompatParcelizer.write().mView;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            ObjectIdInfo.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(context);
            if (remoteActionCompatParcelizerIconCompatParcelizer == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = remoteActionCompatParcelizerIconCompatParcelizer.read;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (remoteActionCompatParcelizer.read() != _renameUsing.RemoteActionCompatParcelizer.read.REMOVED) {
                view.startAnimation(animation);
                this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
                return;
            }
            viewGroup.startViewTransition(view);
            ObjectIdInfo.write writeVar = new ObjectIdInfo.write(animation, viewGroup, view);
            writeVar.setAnimationListener(new write(remoteActionCompatParcelizer, viewGroup, view, this));
            view.startAnimation(writeVar);
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
        }

        public static final class write implements Animation.AnimationListener {
            final /* synthetic */ View AudioAttributesCompatParcelizer;
            final /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
            final /* synthetic */ ViewGroup read;
            final /* synthetic */ _renameUsing.RemoteActionCompatParcelizer write;

            write(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, ViewGroup viewGroup, View view, IconCompatParcelizer iconCompatParcelizer) {
                this.write = remoteActionCompatParcelizer;
                this.read = viewGroup;
                this.AudioAttributesCompatParcelizer = view;
                this.IconCompatParcelizer = iconCompatParcelizer;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                toMagicModuleMetaRepoModel.write(animation, "");
                if (FragmentManager.write(2)) {
                    Objects.toString(this.write);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                toMagicModuleMetaRepoModel.write(animation, "");
                final ViewGroup viewGroup = this.read;
                final View view = this.AudioAttributesCompatParcelizer;
                final IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
                viewGroup.post(new Runnable() { // from class: o._classIfExplicit
                    @Override // java.lang.Runnable
                    public final void run() {
                        _constructStdTypeResolverBuilder.IconCompatParcelizer.write.RemoteActionCompatParcelizer(viewGroup, view, iconCompatParcelizer);
                    }
                });
                if (FragmentManager.write(2)) {
                    Objects.toString(this.write);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, IconCompatParcelizer iconCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(viewGroup, "");
                toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
                viewGroup.endViewTransition(view);
                iconCompatParcelizer.IconCompatParcelizer().read().RemoteActionCompatParcelizer(iconCompatParcelizer);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                toMagicModuleMetaRepoModel.write(animation, "");
            }
        }

        @Override // o._renameUsing.write
        public final void IconCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            View view = remoteActionCompatParcelizer.write().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
        }
    }

    static final class read extends _renameUsing.write {
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
        private AnimatorSet read;

        @Override // o._renameUsing.write
        public final boolean AudioAttributesCompatParcelizer() {
            return true;
        }

        public read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // o._renameUsing.write
        public final void write(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                return;
            }
            Context context = viewGroup.getContext();
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            ObjectIdInfo.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer(context);
            this.read = remoteActionCompatParcelizerIconCompatParcelizer != null ? remoteActionCompatParcelizerIconCompatParcelizer.write : null;
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            Fragment fragmentWrite = remoteActionCompatParcelizer.write();
            boolean z = remoteActionCompatParcelizer.read() == _renameUsing.RemoteActionCompatParcelizer.read.GONE;
            View view = fragmentWrite.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.read;
            if (animatorSet != null) {
                animatorSet.addListener(new AudioAttributesCompatParcelizer(viewGroup, view, z, remoteActionCompatParcelizer, this));
            }
            AnimatorSet animatorSet2 = this.read;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public static final class AudioAttributesCompatParcelizer extends AnimatorListenerAdapter {
            final /* synthetic */ read AudioAttributesCompatParcelizer;
            final /* synthetic */ _renameUsing.RemoteActionCompatParcelizer IconCompatParcelizer;
            final /* synthetic */ View RemoteActionCompatParcelizer;
            final /* synthetic */ ViewGroup read;
            final /* synthetic */ boolean write;

            AudioAttributesCompatParcelizer(ViewGroup viewGroup, View view, boolean z, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, read readVar) {
                this.read = viewGroup;
                this.RemoteActionCompatParcelizer = view;
                this.write = z;
                this.IconCompatParcelizer = remoteActionCompatParcelizer;
                this.AudioAttributesCompatParcelizer = readVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                toMagicModuleMetaRepoModel.write(animator, "");
                this.read.endViewTransition(this.RemoteActionCompatParcelizer);
                if (this.write) {
                    _renameUsing.RemoteActionCompatParcelizer.read readVar = this.IconCompatParcelizer.read();
                    View view = this.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                    readVar.AudioAttributesCompatParcelizer(view, this.read);
                }
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().read().RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
                if (FragmentManager.write(2)) {
                    Objects.toString(this.IconCompatParcelizer);
                }
            }
        }

        @Override // o._renameUsing.write
        public final void RemoteActionCompatParcelizer(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            AnimatorSet animatorSet = this.read;
            if (animatorSet == null) {
                this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !remoteActionCompatParcelizer.write().mTransitioning) {
                return;
            }
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
            long jIconCompatParcelizer = RemoteActionCompatParcelizer.INSTANCE.IconCompatParcelizer(animatorSet);
            long write = (long) (audioAttributesImplApi26Parcelizer.getWrite() * jIconCompatParcelizer);
            if (write == 0) {
                write = 1;
            }
            if (write == jIconCompatParcelizer) {
                write = jIconCompatParcelizer - 1;
            }
            if (FragmentManager.write(2)) {
                Objects.toString(animatorSet);
                Objects.toString(remoteActionCompatParcelizer);
            }
            write.INSTANCE.IconCompatParcelizer(animatorSet, write);
        }

        @Override // o._renameUsing.write
        public final void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            AnimatorSet animatorSet = this.read;
            if (animatorSet == null) {
                this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
        }

        @Override // o._renameUsing.write
        public final void IconCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            AnimatorSet animatorSet = this.read;
            if (animatorSet == null) {
                this.AudioAttributesCompatParcelizer.read().RemoteActionCompatParcelizer(this);
                return;
            }
            _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            if (remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()) {
                write.INSTANCE.AudioAttributesCompatParcelizer(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
                remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
            }
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends _renameUsing.write {
        private final _renameUsing.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private final ArrayList<View> AudioAttributesImplApi21Parcelizer;
        private final ArrayList<View> AudioAttributesImplApi26Parcelizer;
        private final _renameUsing.RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
        private final ArrayList<String> IconCompatParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private final setTitleOptional<String, View> MediaBrowserCompatItemReceiver;
        private final _weirdKey MediaBrowserCompatMediaItem;
        private final setTitleOptional<String, String> MediaBrowserCompatSearchResultReceiver;
        private final Object MediaDescriptionCompat;
        private final List<MediaBrowserCompatCustomActionResultReceiver> MediaMetadataCompat;
        private final _removeUnwantedAccessor RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private final setTitleOptional<String, View> read;
        private final ArrayList<String> write;

        public final List<MediaBrowserCompatCustomActionResultReceiver> MediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaMetadataCompat;
        }

        public final _renameUsing.RemoteActionCompatParcelizer read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final _renameUsing.RemoteActionCompatParcelizer write() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final _removeUnwantedAccessor IconCompatParcelizer() {
            return this.RatingCompat;
        }

        public AudioAttributesImplApi21Parcelizer(List<MediaBrowserCompatCustomActionResultReceiver> list, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, _removeUnwantedAccessor _removeunwantedaccessor, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, setTitleOptional<String, String> settitleoptional, ArrayList<String> arrayList3, ArrayList<String> arrayList4, setTitleOptional<String, View> settitleoptional2, setTitleOptional<String, View> settitleoptional3, boolean z) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(_removeunwantedaccessor, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(arrayList2, "");
            toMagicModuleMetaRepoModel.write(settitleoptional, "");
            toMagicModuleMetaRepoModel.write(arrayList3, "");
            toMagicModuleMetaRepoModel.write(arrayList4, "");
            toMagicModuleMetaRepoModel.write(settitleoptional2, "");
            toMagicModuleMetaRepoModel.write(settitleoptional3, "");
            this.MediaMetadataCompat = list;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer2;
            this.RatingCompat = _removeunwantedaccessor;
            this.MediaDescriptionCompat = obj;
            this.AudioAttributesImplApi21Parcelizer = arrayList;
            this.AudioAttributesImplApi26Parcelizer = arrayList2;
            this.MediaBrowserCompatSearchResultReceiver = settitleoptional;
            this.IconCompatParcelizer = arrayList3;
            this.write = arrayList4;
            this.read = settitleoptional2;
            this.MediaBrowserCompatItemReceiver = settitleoptional3;
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            this.MediaBrowserCompatMediaItem = new _weirdKey();
        }

        public final Object RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
        }

        @Override // o._renameUsing.write
        public final boolean AudioAttributesCompatParcelizer() {
            if (!this.RatingCompat.IconCompatParcelizer()) {
                return false;
            }
            List<MediaBrowserCompatCustomActionResultReceiver> list = this.MediaMetadataCompat;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : list) {
                    if (Build.VERSION.SDK_INT < 34 || mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() == null || !this.RatingCompat.write(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer())) {
                        return false;
                    }
                }
            }
            Object obj = this.MediaDescriptionCompat;
            return obj == null || this.RatingCompat.write(obj);
        }

        private boolean MediaBrowserCompatItemReceiver() {
            List<MediaBrowserCompatCustomActionResultReceiver> list = this.MediaMetadataCompat;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((MediaBrowserCompatCustomActionResultReceiver) it.next()).read().write().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // o._renameUsing.write
        public final void write(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (viewGroup.isLaidOut()) {
                if (MediaBrowserCompatItemReceiver() && this.MediaDescriptionCompat != null && !AudioAttributesCompatParcelizer()) {
                    Objects.toString(this.MediaDescriptionCompat);
                    Objects.toString(this.AudioAttributesCompatParcelizer);
                    Objects.toString(this.AudioAttributesImplBaseParcelizer);
                }
                if (AudioAttributesCompatParcelizer() && MediaBrowserCompatItemReceiver()) {
                    final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
                    Pair<ArrayList<View>, Object> pairWrite = write(viewGroup, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
                    ArrayList<View> arrayListRemoteActionCompatParcelizer = pairWrite.RemoteActionCompatParcelizer();
                    Object obj = pairWrite.read();
                    List<MediaBrowserCompatCustomActionResultReceiver> list = this.MediaMetadataCompat;
                    ArrayList<_renameUsing.RemoteActionCompatParcelizer> arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MediaBrowserCompatCustomActionResultReceiver) it.next()).read());
                    }
                    for (final _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer : arrayList) {
                        this.RatingCompat.IconCompatParcelizer(remoteActionCompatParcelizer.write(), obj, this.MediaBrowserCompatMediaItem, new Runnable() { // from class: o._findTypeResolver
                            @Override // java.lang.Runnable
                            public final void run() {
                                _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.read(writeVar);
                            }
                        }, new Runnable() { // from class: o._findConstructorName
                            @Override // java.lang.Runnable
                            public final void run() {
                                _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.write(remoteActionCompatParcelizer, this);
                            }
                        });
                    }
                    write(arrayListRemoteActionCompatParcelizer, viewGroup, new AnonymousClass5(viewGroup, obj, writeVar));
                    return;
                }
                return;
            }
            Iterator<T> it2 = this.MediaMetadataCompat.iterator();
            while (it2.hasNext()) {
                _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = ((MediaBrowserCompatCustomActionResultReceiver) it2.next()).read();
                if (FragmentManager.write(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(remoteActionCompatParcelizer2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(MagicModuleUseCaseImplWhenMappings.write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) writeVar.write;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer);
        }

        /* JADX INFO: renamed from: o._constructStdTypeResolverBuilder$AudioAttributesImplApi21Parcelizer$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ ViewGroup $IconCompatParcelizer;
            final /* synthetic */ Object $RemoteActionCompatParcelizer;
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> $write;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                write();
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, o._constructStdTypeResolverBuilder$AudioAttributesImplApi21Parcelizer$5$3] */
            public final void write() {
                AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer.this;
                audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer.IconCompatParcelizer().IconCompatParcelizer(this.$IconCompatParcelizer, this.$RemoteActionCompatParcelizer));
                boolean z = AudioAttributesImplApi21Parcelizer.this.RemoteActionCompatParcelizer() != null;
                Object obj = this.$RemoteActionCompatParcelizer;
                ViewGroup viewGroup = this.$IconCompatParcelizer;
                if (!z) {
                    StringBuilder sb = new StringBuilder("Unable to start transition ");
                    sb.append(obj);
                    sb.append(" for container ");
                    sb.append(viewGroup);
                    sb.append('.');
                    throw new IllegalStateException(sb.toString().toString());
                }
                this.$write.write = new AnonymousClass3(AudioAttributesImplApi21Parcelizer.this, this.$RemoteActionCompatParcelizer, this.$IconCompatParcelizer);
                if (FragmentManager.write(2)) {
                    Objects.toString(AudioAttributesImplApi21Parcelizer.this.read());
                    Objects.toString(AudioAttributesImplApi21Parcelizer.this.write());
                }
            }

            /* JADX INFO: renamed from: o._constructStdTypeResolverBuilder$AudioAttributesImplApi21Parcelizer$5$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
                final /* synthetic */ Object $RemoteActionCompatParcelizer;
                final /* synthetic */ ViewGroup $write;
                final /* synthetic */ AudioAttributesImplApi21Parcelizer read;

                @Override // kotlin.getCreatedOnDateMs
                public final /* synthetic */ getShowPopup invoke() {
                    write();
                    return getShowPopup.INSTANCE;
                }

                public final void write() {
                    List<MediaBrowserCompatCustomActionResultReceiver> listMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver();
                    if (!(listMediaBrowserCompatCustomActionResultReceiver instanceof Collection) || !listMediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                        Iterator<T> it = listMediaBrowserCompatCustomActionResultReceiver.iterator();
                        while (it.hasNext()) {
                            if (!((MediaBrowserCompatCustomActionResultReceiver) it.next()).read().MediaBrowserCompatItemReceiver()) {
                                FragmentManager.write(2);
                                _weirdKey _weirdkey = new _weirdKey();
                                _removeUnwantedAccessor _removeunwantedaccessorIconCompatParcelizer = this.read.IconCompatParcelizer();
                                Fragment fragmentWrite = this.read.MediaBrowserCompatCustomActionResultReceiver().get(0).read().write();
                                Object obj = this.$RemoteActionCompatParcelizer;
                                final AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = this.read;
                                _removeunwantedaccessorIconCompatParcelizer.AudioAttributesCompatParcelizer(fragmentWrite, obj, _weirdkey, new Runnable() { // from class: o.JacksonAnnotationIntrospector1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.AnonymousClass5.AnonymousClass3.write(audioAttributesImplApi21Parcelizer);
                                    }
                                });
                                _weirdkey.read();
                                return;
                            }
                        }
                    }
                    FragmentManager.write(2);
                    _removeUnwantedAccessor _removeunwantedaccessorIconCompatParcelizer2 = this.read.IconCompatParcelizer();
                    Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
                    toMagicModuleMetaRepoModel.write(objRemoteActionCompatParcelizer);
                    final AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = this.read;
                    final ViewGroup viewGroup = this.$write;
                    _removeunwantedaccessorIconCompatParcelizer2.write(objRemoteActionCompatParcelizer, new Runnable() { // from class: o.MethodGenericTypeResolver
                        @Override // java.lang.Runnable
                        public final void run() {
                            _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.AnonymousClass5.AnonymousClass3.IconCompatParcelizer(audioAttributesImplApi21Parcelizer2, viewGroup);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void IconCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, ViewGroup viewGroup) {
                    toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
                    toMagicModuleMetaRepoModel.write(viewGroup, "");
                    Iterator<T> it = audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver().iterator();
                    while (it.hasNext()) {
                        _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ((MediaBrowserCompatCustomActionResultReceiver) it.next()).read();
                        View view = remoteActionCompatParcelizer.write().getView();
                        if (view != null) {
                            remoteActionCompatParcelizer.read().AudioAttributesCompatParcelizer(view, viewGroup);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void write(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
                    toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
                    FragmentManager.write(2);
                    Iterator<T> it = audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver().iterator();
                    while (it.hasNext()) {
                        ((MediaBrowserCompatCustomActionResultReceiver) it.next()).read().RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.read = audioAttributesImplApi21Parcelizer;
                    this.$RemoteActionCompatParcelizer = obj;
                    this.$write = viewGroup;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(ViewGroup viewGroup, Object obj, MagicModuleUseCaseImplWhenMappings.write<getCreatedOnDateMs<getShowPopup>> writeVar) {
                super(0);
                this.$IconCompatParcelizer = viewGroup;
                this.$RemoteActionCompatParcelizer = obj;
                this.$write = writeVar;
            }
        }

        @Override // o._renameUsing.write
        public final void RemoteActionCompatParcelizer(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            Object obj = this.RemoteActionCompatParcelizer;
            if (obj != null) {
                this.RatingCompat.write(obj, audioAttributesImplApi26Parcelizer.getWrite());
            }
        }

        @Override // o._renameUsing.write
        public final void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (viewGroup.isLaidOut()) {
                Object obj = this.RemoteActionCompatParcelizer;
                if (obj != null) {
                    _removeUnwantedAccessor _removeunwantedaccessor = this.RatingCompat;
                    toMagicModuleMetaRepoModel.write(obj);
                    _removeunwantedaccessor.AudioAttributesCompatParcelizer(obj);
                    if (FragmentManager.write(2)) {
                        Objects.toString(this.AudioAttributesCompatParcelizer);
                        Objects.toString(this.AudioAttributesImplBaseParcelizer);
                        return;
                    }
                    return;
                }
                Pair<ArrayList<View>, Object> pairWrite = write(viewGroup, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
                ArrayList<View> arrayListRemoteActionCompatParcelizer = pairWrite.RemoteActionCompatParcelizer();
                Object obj2 = pairWrite.read();
                List<MediaBrowserCompatCustomActionResultReceiver> list = this.MediaMetadataCompat;
                ArrayList<_renameUsing.RemoteActionCompatParcelizer> arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MediaBrowserCompatCustomActionResultReceiver) it.next()).read());
                }
                for (final _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer : arrayList) {
                    this.RatingCompat.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.write(), obj2, this.MediaBrowserCompatMediaItem, new Runnable() { // from class: o.MemberKey
                        @Override // java.lang.Runnable
                        public final void run() {
                            _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(remoteActionCompatParcelizer, this);
                        }
                    });
                }
                write(arrayListRemoteActionCompatParcelizer, viewGroup, new AnonymousClass4(viewGroup, obj2));
                if (FragmentManager.write(2)) {
                    Objects.toString(this.AudioAttributesCompatParcelizer);
                    Objects.toString(this.AudioAttributesImplBaseParcelizer);
                    return;
                }
                return;
            }
            for (MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver : this.MediaMetadataCompat) {
                _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = mediaBrowserCompatCustomActionResultReceiver.read();
                if (FragmentManager.write(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(remoteActionCompatParcelizer2);
                }
                mediaBrowserCompatCustomActionResultReceiver.read().RemoteActionCompatParcelizer(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
            if (FragmentManager.write(2)) {
                Objects.toString(remoteActionCompatParcelizer);
            }
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer);
        }

        /* JADX INFO: renamed from: o._constructStdTypeResolverBuilder$AudioAttributesImplApi21Parcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ ViewGroup $IconCompatParcelizer;
            final /* synthetic */ Object $read;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                IconCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            public final void IconCompatParcelizer() {
                AudioAttributesImplApi21Parcelizer.this.IconCompatParcelizer().write(this.$IconCompatParcelizer, this.$read);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ViewGroup viewGroup, Object obj) {
                super(0);
                this.$IconCompatParcelizer = viewGroup;
                this.$read = obj;
            }
        }

        private final Pair<ArrayList<View>, Object> write(ViewGroup viewGroup, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            Iterator<MediaBrowserCompatCustomActionResultReceiver> it;
            final _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
            final _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = remoteActionCompatParcelizer2;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator<MediaBrowserCompatCustomActionResultReceiver> it2 = this.MediaMetadataCompat.iterator();
            boolean z = false;
            View view2 = null;
            while (it2.hasNext()) {
                if (it2.next().AudioAttributesImplApi26Parcelizer() && remoteActionCompatParcelizer4 != null && remoteActionCompatParcelizer3 != null && !this.MediaBrowserCompatSearchResultReceiver.isEmpty() && this.MediaDescriptionCompat != null) {
                    _collectIgnorals.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer2.write(), this.MediaBrowserCompatCustomActionResultReceiver, this.read, true);
                    ViewGroup viewGroup2 = viewGroup;
                    childArray.RemoteActionCompatParcelizer(viewGroup2, new Runnable() { // from class: o._propertyName
                        @Override // java.lang.Runnable
                        public final void run() {
                            _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.read(remoteActionCompatParcelizer3, remoteActionCompatParcelizer4, this);
                        }
                    });
                    this.AudioAttributesImplApi21Parcelizer.addAll(this.read.values());
                    if (!this.write.isEmpty()) {
                        String str = this.write.get(0);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                        view2 = this.read.get(str);
                        this.RatingCompat.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, view2);
                    }
                    this.AudioAttributesImplApi26Parcelizer.addAll(this.MediaBrowserCompatItemReceiver.values());
                    if (!this.IconCompatParcelizer.isEmpty()) {
                        String str2 = this.IconCompatParcelizer.get(0);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                        final View view3 = this.MediaBrowserCompatItemReceiver.get(str2);
                        if (view3 != null) {
                            final _removeUnwantedAccessor _removeunwantedaccessor = this.RatingCompat;
                            childArray.RemoteActionCompatParcelizer(viewGroup2, new Runnable() { // from class: o._isIgnorable
                                @Override // java.lang.Runnable
                                public final void run() {
                                    _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.read(_removeunwantedaccessor, view3, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.RatingCompat.IconCompatParcelizer(this.MediaDescriptionCompat, view, this.AudioAttributesImplApi21Parcelizer);
                    _removeUnwantedAccessor _removeunwantedaccessor2 = this.RatingCompat;
                    Object obj = this.MediaDescriptionCompat;
                    _removeunwantedaccessor2.IconCompatParcelizer(obj, null, null, null, null, obj, this.AudioAttributesImplApi26Parcelizer);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<MediaBrowserCompatCustomActionResultReceiver> it3 = this.MediaMetadataCompat.iterator();
            Object objRemoteActionCompatParcelizer = null;
            Object objRemoteActionCompatParcelizer2 = null;
            while (it3.hasNext()) {
                MediaBrowserCompatCustomActionResultReceiver next = it3.next();
                _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = next.read();
                Object objIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(next.RemoteActionCompatParcelizer());
                if (objIconCompatParcelizer != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    it = it3;
                    View view4 = remoteActionCompatParcelizer5.write().mView;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view4, "");
                    RemoteActionCompatParcelizer(arrayList2, view4);
                    if (this.MediaDescriptionCompat != null && (remoteActionCompatParcelizer5 == remoteActionCompatParcelizer4 || remoteActionCompatParcelizer5 == remoteActionCompatParcelizer3)) {
                        if (remoteActionCompatParcelizer5 == remoteActionCompatParcelizer4) {
                            arrayList2.removeAll(IntermediateLoginResponseBody.onPlayFromUri(this.AudioAttributesImplApi21Parcelizer));
                        } else {
                            arrayList2.removeAll(IntermediateLoginResponseBody.onPlayFromUri(this.AudioAttributesImplApi26Parcelizer));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.RatingCompat.RemoteActionCompatParcelizer(objIconCompatParcelizer, view);
                    } else {
                        this.RatingCompat.AudioAttributesCompatParcelizer(objIconCompatParcelizer, arrayList2);
                        this.RatingCompat.IconCompatParcelizer(objIconCompatParcelizer, objIconCompatParcelizer, arrayList2, null, null, null, null);
                        if (remoteActionCompatParcelizer5.read() == _renameUsing.RemoteActionCompatParcelizer.read.GONE) {
                            remoteActionCompatParcelizer5.MediaDescriptionCompat();
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(remoteActionCompatParcelizer5.write().mView);
                            this.RatingCompat.read(objIconCompatParcelizer, remoteActionCompatParcelizer5.write().mView, arrayList3);
                            childArray.RemoteActionCompatParcelizer(viewGroup, new Runnable() { // from class: o._constructVirtualProperty
                                @Override // java.lang.Runnable
                                public final void run() {
                                    _constructStdTypeResolverBuilder.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(arrayList2);
                                }
                            });
                        }
                    }
                    if (remoteActionCompatParcelizer5.read() == _renameUsing.RemoteActionCompatParcelizer.read.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z) {
                            this.RatingCompat.read(objIconCompatParcelizer, rect);
                        }
                        if (FragmentManager.write(2)) {
                            Objects.toString(objIconCompatParcelizer);
                            for (View view5 : arrayList2) {
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view5, "");
                                Objects.toString(view5);
                            }
                        }
                    } else {
                        this.RatingCompat.AudioAttributesCompatParcelizer(objIconCompatParcelizer, view2);
                        if (FragmentManager.write(2)) {
                            Objects.toString(objIconCompatParcelizer);
                            for (View view6 : arrayList2) {
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view6, "");
                                Objects.toString(view6);
                            }
                        }
                    }
                    if (next.AudioAttributesImplApi21Parcelizer()) {
                        objRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer, objIconCompatParcelizer, null);
                    } else {
                        objRemoteActionCompatParcelizer2 = this.RatingCompat.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer2, objIconCompatParcelizer, null);
                    }
                } else {
                    it = it3;
                }
                remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
                remoteActionCompatParcelizer4 = remoteActionCompatParcelizer2;
                it3 = it;
            }
            Object obj2 = this.RatingCompat.read(objRemoteActionCompatParcelizer, objRemoteActionCompatParcelizer2, this.MediaDescriptionCompat);
            if (FragmentManager.write(2)) {
                Objects.toString(obj2);
            }
            return new Pair<>(arrayList, obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(_renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _renameUsing.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi21Parcelizer, "");
            _collectIgnorals.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer2.write(), audioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver, audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(_removeUnwantedAccessor _removeunwantedaccessor, View view, Rect rect) {
            toMagicModuleMetaRepoModel.write(_removeunwantedaccessor, "");
            toMagicModuleMetaRepoModel.write(rect, "");
            _removeunwantedaccessor.write(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(ArrayList arrayList) {
            toMagicModuleMetaRepoModel.write(arrayList, "");
            _collectIgnorals.IconCompatParcelizer(arrayList, 4);
        }

        private final void write(ArrayList<View> arrayList, ViewGroup viewGroup, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            ArrayList<View> arrayList2 = arrayList;
            _collectIgnorals.IconCompatParcelizer(arrayList2, 4);
            ArrayList<String> arrayListAudioAttributesCompatParcelizer = this.RatingCompat.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            if (FragmentManager.write(2)) {
                for (View view : this.AudioAttributesImplApi21Parcelizer) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                    View view2 = view;
                    Objects.toString(view2);
                    InvalidTypeIdException.onMediaButtonEvent(view2);
                }
                for (View view3 : this.AudioAttributesImplApi26Parcelizer) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
                    View view4 = view3;
                    Objects.toString(view4);
                    InvalidTypeIdException.onMediaButtonEvent(view4);
                }
            }
            getcreatedondatems.invoke();
            this.RatingCompat.read(viewGroup, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, arrayListAudioAttributesCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
            _collectIgnorals.IconCompatParcelizer(arrayList2, 0);
            this.RatingCompat.IconCompatParcelizer(this.MediaDescriptionCompat, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // o._renameUsing.write
        public final void IconCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            this.MediaBrowserCompatMediaItem.read();
        }

        private final void RemoteActionCompatParcelizer(ArrayList<View> arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (Java7Handlers.IconCompatParcelizer(viewGroup)) {
                    if (arrayList.contains(view)) {
                        return;
                    }
                    arrayList.add(view);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
                        RemoteActionCompatParcelizer(arrayList, childAt);
                    }
                }
                return;
            }
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_constructStdTypeResolverBuilder$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "p0", "", "IconCompatParcelizer", "(Landroid/animation/AnimatorSet;)J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        public final long IconCompatParcelizer(AnimatorSet p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return p0.getTotalDuration();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/_constructStdTypeResolverBuilder$write;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/animation/AnimatorSet;)V", "", "p1", "IconCompatParcelizer", "(Landroid/animation/AnimatorSet;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {
        public static final write INSTANCE = new write();

        private write() {
        }

        public final void AudioAttributesCompatParcelizer(AnimatorSet p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.reverse();
        }

        public final void IconCompatParcelizer(AnimatorSet p0, long p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.setCurrentPlayTime(p1);
        }
    }
}
