package kotlin;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.Objects;
import kotlin._renameUsing;
import kotlin.anyIgnorals;
import kotlin.findSubtypesCheckRepeatedNames;

/* JADX INFO: loaded from: classes2.dex */
public final class _addSetterMethod {
    private final getGeneratorType IconCompatParcelizer;
    private final Fragment RemoteActionCompatParcelizer;
    private final _property write;
    private boolean read = false;
    private int AudioAttributesCompatParcelizer = -1;

    public _addSetterMethod(getGeneratorType getgeneratortype, _property _propertyVar, Fragment fragment) {
        this.IconCompatParcelizer = getgeneratortype;
        this.write = _propertyVar;
        this.RemoteActionCompatParcelizer = fragment;
    }

    public _addSetterMethod(getGeneratorType getgeneratortype, _property _propertyVar, ClassLoader classLoader, NopAnnotationIntrospector1 nopAnnotationIntrospector1, Bundle bundle) {
        this.IconCompatParcelizer = getgeneratortype;
        this.write = _propertyVar;
        Fragment fragmentWrite = ((FragmentState) bundle.getParcelable(NotesDispatchAddressRequestKt.KEY_STATE)).write(nopAnnotationIntrospector1, classLoader);
        this.RemoteActionCompatParcelizer = fragmentWrite;
        fragmentWrite.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentWrite.setArguments(bundle2);
        if (FragmentManager.write(2)) {
            Objects.toString(fragmentWrite);
        }
    }

    public _addSetterMethod(getGeneratorType getgeneratortype, _property _propertyVar, Fragment fragment, Bundle bundle) {
        this.IconCompatParcelizer = getgeneratortype;
        this.write = _propertyVar;
        this.RemoteActionCompatParcelizer = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTargetWho = fragment.mTarget != null ? fragment.mTarget.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public final Fragment IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    private int AudioAttributesImplApi21Parcelizer() {
        if (this.RemoteActionCompatParcelizer.mFragmentManager == null) {
            return this.RemoteActionCompatParcelizer.mState;
        }
        int iMin = this.AudioAttributesCompatParcelizer;
        int i = AnonymousClass3.read[this.RemoteActionCompatParcelizer.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i == 3) {
                iMin = Math.min(iMin, 1);
            } else if (i == 4) {
                iMin = Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (this.RemoteActionCompatParcelizer.mFromLayout) {
            if (this.RemoteActionCompatParcelizer.mInLayout) {
                iMin = Math.max(this.AudioAttributesCompatParcelizer, 2);
                if (this.RemoteActionCompatParcelizer.mView != null && this.RemoteActionCompatParcelizer.mView.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.AudioAttributesCompatParcelizer < 4 ? Math.min(iMin, this.RemoteActionCompatParcelizer.mState) : Math.min(iMin, 1);
            }
        }
        if (this.RemoteActionCompatParcelizer.mInDynamicContainer && this.RemoteActionCompatParcelizer.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.RemoteActionCompatParcelizer.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        _renameUsing.RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer = this.RemoteActionCompatParcelizer.mContainer != null ? _renameUsing.read(this.RemoteActionCompatParcelizer.mContainer, this.RemoteActionCompatParcelizer.getParentFragmentManager()).IconCompatParcelizer(this) : null;
        if (IconCompatParcelizer == _renameUsing.RemoteActionCompatParcelizer.IconCompatParcelizer.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (IconCompatParcelizer == _renameUsing.RemoteActionCompatParcelizer.IconCompatParcelizer.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (this.RemoteActionCompatParcelizer.mRemoving) {
            if (this.RemoteActionCompatParcelizer.isInBackStack()) {
                iMin = Math.min(iMin, 1);
            } else {
                iMin = Math.min(iMin, -1);
            }
        }
        if (this.RemoteActionCompatParcelizer.mDeferStart && this.RemoteActionCompatParcelizer.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.RemoteActionCompatParcelizer.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.write(2)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: o._addSetterMethod$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[anyIgnorals.write.values().length];
            read = iArr;
            try {
                iArr[anyIgnorals.write.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[anyIgnorals.write.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[anyIgnorals.write.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[anyIgnorals.write.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.read) {
            if (FragmentManager.write(2)) {
                Objects.toString(IconCompatParcelizer());
                return;
            }
            return;
        }
        try {
            this.read = true;
            boolean z = false;
            while (true) {
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
                if (iAudioAttributesImplApi21Parcelizer != this.RemoteActionCompatParcelizer.mState) {
                    if (iAudioAttributesImplApi21Parcelizer > this.RemoteActionCompatParcelizer.mState) {
                        switch (this.RemoteActionCompatParcelizer.mState + 1) {
                            case 0:
                                AudioAttributesImplApi26Parcelizer();
                                break;
                            case 1:
                                AudioAttributesImplBaseParcelizer();
                                break;
                            case 2:
                                read();
                                MediaMetadataCompat();
                                break;
                            case 3:
                                MediaBrowserCompatCustomActionResultReceiver();
                                break;
                            case 4:
                                if (this.RemoteActionCompatParcelizer.mView != null && this.RemoteActionCompatParcelizer.mContainer != null) {
                                    _renameUsing.read(this.RemoteActionCompatParcelizer.mContainer, this.RemoteActionCompatParcelizer.getParentFragmentManager()).AudioAttributesCompatParcelizer(_renameUsing.RemoteActionCompatParcelizer.read.write(this.RemoteActionCompatParcelizer.mView.getVisibility()), this);
                                }
                                this.RemoteActionCompatParcelizer.mState = 4;
                                break;
                            case 5:
                                handleMediaPlayPauseIfPendingOnHandler();
                                break;
                            case 6:
                                this.RemoteActionCompatParcelizer.mState = 6;
                                break;
                            case 7:
                                onAddQueueItem();
                                break;
                        }
                    } else {
                        switch (this.RemoteActionCompatParcelizer.mState - 1) {
                            case -1:
                                MediaBrowserCompatMediaItem();
                                break;
                            case 0:
                                if (this.RemoteActionCompatParcelizer.mBeingSaved && this.write.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer.mWho) == null) {
                                    this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mWho, MediaBrowserCompatItemReceiver());
                                }
                                MediaBrowserCompatSearchResultReceiver();
                                break;
                            case 1:
                                RatingCompat();
                                this.RemoteActionCompatParcelizer.mState = 1;
                                break;
                            case 2:
                                this.RemoteActionCompatParcelizer.mInLayout = false;
                                this.RemoteActionCompatParcelizer.mState = 2;
                                break;
                            case 3:
                                if (FragmentManager.write(3)) {
                                    Objects.toString(this.RemoteActionCompatParcelizer);
                                }
                                if (this.RemoteActionCompatParcelizer.mBeingSaved) {
                                    this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mWho, MediaBrowserCompatItemReceiver());
                                } else if (this.RemoteActionCompatParcelizer.mView != null && this.RemoteActionCompatParcelizer.mSavedViewState == null) {
                                    onCustomAction();
                                }
                                if (this.RemoteActionCompatParcelizer.mView != null && this.RemoteActionCompatParcelizer.mContainer != null) {
                                    _renameUsing.read(this.RemoteActionCompatParcelizer.mContainer, this.RemoteActionCompatParcelizer.getParentFragmentManager()).AudioAttributesCompatParcelizer(this);
                                }
                                this.RemoteActionCompatParcelizer.mState = 3;
                                break;
                            case 4:
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                                break;
                            case 5:
                                this.RemoteActionCompatParcelizer.mState = 5;
                                break;
                            case 6:
                                MediaDescriptionCompat();
                                break;
                        }
                    }
                    z = true;
                } else {
                    if (!z && this.RemoteActionCompatParcelizer.mState == -1 && this.RemoteActionCompatParcelizer.mRemoving && !this.RemoteActionCompatParcelizer.isInBackStack() && !this.RemoteActionCompatParcelizer.mBeingSaved) {
                        if (FragmentManager.write(3)) {
                            Objects.toString(this.RemoteActionCompatParcelizer);
                        }
                        this.write.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, true);
                        this.write.RemoteActionCompatParcelizer(this);
                        if (FragmentManager.write(3)) {
                            Objects.toString(this.RemoteActionCompatParcelizer);
                        }
                        this.RemoteActionCompatParcelizer.initState();
                    }
                    if (this.RemoteActionCompatParcelizer.mHiddenChanged) {
                        if (this.RemoteActionCompatParcelizer.mView != null && this.RemoteActionCompatParcelizer.mContainer != null) {
                            _renameUsing _renameusing = _renameUsing.read(this.RemoteActionCompatParcelizer.mContainer, this.RemoteActionCompatParcelizer.getParentFragmentManager());
                            if (this.RemoteActionCompatParcelizer.mHidden) {
                                _renameusing.write(this);
                            } else {
                                _renameusing.RemoteActionCompatParcelizer(this);
                            }
                        }
                        if (this.RemoteActionCompatParcelizer.mFragmentManager != null) {
                            this.RemoteActionCompatParcelizer.mFragmentManager.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
                        }
                        this.RemoteActionCompatParcelizer.mHiddenChanged = false;
                        Fragment fragment = this.RemoteActionCompatParcelizer;
                        fragment.onHiddenChanged(fragment.mHidden);
                        this.RemoteActionCompatParcelizer.mChildFragmentManager.AudioAttributesImplBaseParcelizer();
                    }
                    return;
                }
            }
        } finally {
            this.read = false;
        }
    }

    final void read() {
        if (this.RemoteActionCompatParcelizer.mFromLayout && this.RemoteActionCompatParcelizer.mInLayout && !this.RemoteActionCompatParcelizer.mPerformedCreateView) {
            if (FragmentManager.write(3)) {
                Objects.toString(this.RemoteActionCompatParcelizer);
            }
            Bundle bundle = this.RemoteActionCompatParcelizer.mSavedFragmentState != null ? this.RemoteActionCompatParcelizer.mSavedFragmentState.getBundle("savedInstanceState") : null;
            Fragment fragment = this.RemoteActionCompatParcelizer;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle), null, bundle);
            if (this.RemoteActionCompatParcelizer.mView != null) {
                this.RemoteActionCompatParcelizer.mView.setSaveFromParentEnabled(false);
                this.RemoteActionCompatParcelizer.mView.setTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.fragment_container_view_tag, this.RemoteActionCompatParcelizer);
                if (this.RemoteActionCompatParcelizer.mHidden) {
                    this.RemoteActionCompatParcelizer.mView.setVisibility(8);
                }
                this.RemoteActionCompatParcelizer.performViewCreated();
                getGeneratorType getgeneratortype = this.IconCompatParcelizer;
                Fragment fragment2 = this.RemoteActionCompatParcelizer;
                getgeneratortype.write(fragment2, fragment2.mView, bundle, false);
                this.RemoteActionCompatParcelizer.mState = 2;
            }
        }
    }

    public final void IconCompatParcelizer(ClassLoader classLoader) {
        if (this.RemoteActionCompatParcelizer.mSavedFragmentState != null) {
            this.RemoteActionCompatParcelizer.mSavedFragmentState.setClassLoader(classLoader);
            if (this.RemoteActionCompatParcelizer.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                this.RemoteActionCompatParcelizer.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                Fragment fragment = this.RemoteActionCompatParcelizer;
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                Fragment fragment2 = this.RemoteActionCompatParcelizer;
                fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
                FragmentState fragmentState = (FragmentState) this.RemoteActionCompatParcelizer.mSavedFragmentState.getParcelable(NotesDispatchAddressRequestKt.KEY_STATE);
                if (fragmentState != null) {
                    this.RemoteActionCompatParcelizer.mTargetWho = fragmentState.MediaMetadataCompat;
                    this.RemoteActionCompatParcelizer.mTargetRequestCode = fragmentState.RatingCompat;
                    if (this.RemoteActionCompatParcelizer.mSavedUserVisibleHint != null) {
                        Fragment fragment3 = this.RemoteActionCompatParcelizer;
                        fragment3.mUserVisibleHint = fragment3.mSavedUserVisibleHint.booleanValue();
                        this.RemoteActionCompatParcelizer.mSavedUserVisibleHint = null;
                    } else {
                        this.RemoteActionCompatParcelizer.mUserVisibleHint = fragmentState.MediaBrowserCompatMediaItem;
                    }
                }
                if (this.RemoteActionCompatParcelizer.mUserVisibleHint) {
                    return;
                }
                this.RemoteActionCompatParcelizer.mDeferStart = true;
            } catch (BadParcelableException e) {
                StringBuilder sb = new StringBuilder("Failed to restore view hierarchy state for fragment ");
                sb.append(IconCompatParcelizer());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        _addSetterMethod _addsettermethodIconCompatParcelizer = null;
        if (this.RemoteActionCompatParcelizer.mTarget != null) {
            _addSetterMethod _addsettermethodIconCompatParcelizer2 = this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mTarget.mWho);
            if (_addsettermethodIconCompatParcelizer2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(" declared target fragment ");
                sb.append(this.RemoteActionCompatParcelizer.mTarget);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            Fragment fragment = this.RemoteActionCompatParcelizer;
            fragment.mTargetWho = fragment.mTarget.mWho;
            this.RemoteActionCompatParcelizer.mTarget = null;
            _addsettermethodIconCompatParcelizer = _addsettermethodIconCompatParcelizer2;
        } else if (this.RemoteActionCompatParcelizer.mTargetWho != null && (_addsettermethodIconCompatParcelizer = this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mTargetWho)) == null) {
            StringBuilder sb2 = new StringBuilder("Fragment ");
            sb2.append(this.RemoteActionCompatParcelizer);
            sb2.append(" declared target fragment ");
            sb2.append(this.RemoteActionCompatParcelizer.mTargetWho);
            sb2.append(" that does not belong to this FragmentManager!");
            throw new IllegalStateException(sb2.toString());
        }
        if (_addsettermethodIconCompatParcelizer != null) {
            _addsettermethodIconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        Fragment fragment2 = this.RemoteActionCompatParcelizer;
        fragment2.mHost = fragment2.mFragmentManager.onPlay();
        Fragment fragment3 = this.RemoteActionCompatParcelizer;
        fragment3.mParentFragment = fragment3.mFragmentManager.onFastForward();
        this.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer, false);
        this.RemoteActionCompatParcelizer.performAttach();
        this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, false);
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        Bundle bundle = this.RemoteActionCompatParcelizer.mSavedFragmentState != null ? this.RemoteActionCompatParcelizer.mSavedFragmentState.getBundle("savedInstanceState") : null;
        if (!this.RemoteActionCompatParcelizer.mIsCreated) {
            this.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer, bundle, false);
            this.RemoteActionCompatParcelizer.performCreate(bundle);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, bundle, false);
        } else {
            this.RemoteActionCompatParcelizer.mState = 1;
            this.RemoteActionCompatParcelizer.restoreChildFragmentState();
        }
    }

    private void MediaMetadataCompat() {
        String resourceName;
        if (this.RemoteActionCompatParcelizer.mFromLayout) {
            return;
        }
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        ViewGroup viewGroup = null;
        Bundle bundle = this.RemoteActionCompatParcelizer.mSavedFragmentState != null ? this.RemoteActionCompatParcelizer.mSavedFragmentState.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.RemoteActionCompatParcelizer.performGetLayoutInflater(bundle);
        if (this.RemoteActionCompatParcelizer.mContainer != null) {
            viewGroup = this.RemoteActionCompatParcelizer.mContainer;
        } else if (this.RemoteActionCompatParcelizer.mContainerId != 0) {
            if (this.RemoteActionCompatParcelizer.mContainerId == -1) {
                StringBuilder sb = new StringBuilder("Cannot create fragment ");
                sb.append(this.RemoteActionCompatParcelizer);
                sb.append(" for a container view with no id");
                throw new IllegalArgumentException(sb.toString());
            }
            viewGroup = (ViewGroup) this.RemoteActionCompatParcelizer.mFragmentManager.onAddQueueItem().read(this.RemoteActionCompatParcelizer.mContainerId);
            if (viewGroup == null) {
                if (!this.RemoteActionCompatParcelizer.mRestored && !this.RemoteActionCompatParcelizer.mInDynamicContainer) {
                    try {
                        resourceName = this.RemoteActionCompatParcelizer.getResources().getResourceName(this.RemoteActionCompatParcelizer.mContainerId);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    StringBuilder sb2 = new StringBuilder("No view found for id 0x");
                    sb2.append(Integer.toHexString(this.RemoteActionCompatParcelizer.mContainerId));
                    sb2.append(" (");
                    sb2.append(resourceName);
                    sb2.append(") for fragment ");
                    sb2.append(this.RemoteActionCompatParcelizer);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (!(viewGroup instanceof FragmentContainerView)) {
                getJsonValueAccessor.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, viewGroup);
            }
        }
        this.RemoteActionCompatParcelizer.mContainer = viewGroup;
        this.RemoteActionCompatParcelizer.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle);
        if (this.RemoteActionCompatParcelizer.mView != null) {
            if (FragmentManager.write(3)) {
                Objects.toString(this.RemoteActionCompatParcelizer);
            }
            this.RemoteActionCompatParcelizer.mView.setSaveFromParentEnabled(false);
            this.RemoteActionCompatParcelizer.mView.setTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.fragment_container_view_tag, this.RemoteActionCompatParcelizer);
            if (viewGroup != null) {
                write();
            }
            if (this.RemoteActionCompatParcelizer.mHidden) {
                this.RemoteActionCompatParcelizer.mView.setVisibility(8);
            }
            if (this.RemoteActionCompatParcelizer.mView.isAttachedToWindow()) {
                InvalidTypeIdException.onSetRepeatMode(this.RemoteActionCompatParcelizer.mView);
            } else {
                final View view = this.RemoteActionCompatParcelizer.mView;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o._addSetterMethod.4
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        InvalidTypeIdException.onSetRepeatMode(view);
                    }
                });
            }
            this.RemoteActionCompatParcelizer.performViewCreated();
            getGeneratorType getgeneratortype = this.IconCompatParcelizer;
            Fragment fragment = this.RemoteActionCompatParcelizer;
            getgeneratortype.write(fragment, fragment.mView, bundle, false);
            int visibility = this.RemoteActionCompatParcelizer.mView.getVisibility();
            this.RemoteActionCompatParcelizer.setPostOnViewCreatedAlpha(this.RemoteActionCompatParcelizer.mView.getAlpha());
            if (this.RemoteActionCompatParcelizer.mContainer != null && visibility == 0) {
                View viewFindFocus = this.RemoteActionCompatParcelizer.mView.findFocus();
                if (viewFindFocus != null) {
                    this.RemoteActionCompatParcelizer.setFocusedView(viewFindFocus);
                    if (FragmentManager.write(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(this.RemoteActionCompatParcelizer);
                    }
                }
                this.RemoteActionCompatParcelizer.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        this.RemoteActionCompatParcelizer.mState = 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        Bundle bundle = this.RemoteActionCompatParcelizer.mSavedFragmentState != null ? this.RemoteActionCompatParcelizer.mSavedFragmentState.getBundle("savedInstanceState") : null;
        this.RemoteActionCompatParcelizer.performActivityCreated(bundle);
        this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, bundle, false);
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer.performStart();
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, false);
    }

    private void onAddQueueItem() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        View focusedView = this.RemoteActionCompatParcelizer.getFocusedView();
        if (focusedView != null && RemoteActionCompatParcelizer(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.write(2)) {
                Objects.toString(focusedView);
                Objects.toString(this.RemoteActionCompatParcelizer);
                Objects.toString(this.RemoteActionCompatParcelizer.mView.findFocus());
            }
        }
        this.RemoteActionCompatParcelizer.setFocusedView(null);
        this.RemoteActionCompatParcelizer.performResume();
        this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, false);
        this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mWho, null);
        this.RemoteActionCompatParcelizer.mSavedFragmentState = null;
        this.RemoteActionCompatParcelizer.mSavedViewState = null;
        this.RemoteActionCompatParcelizer.mSavedViewRegistryState = null;
    }

    private boolean RemoteActionCompatParcelizer(View view) {
        if (view == this.RemoteActionCompatParcelizer.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.RemoteActionCompatParcelizer.mView) {
                return true;
            }
        }
        return false;
    }

    private void MediaDescriptionCompat() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer.performPause();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, false);
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer.performStop();
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, false);
    }

    final Bundle MediaBrowserCompatItemReceiver() {
        Bundle bundle = new Bundle();
        if (this.RemoteActionCompatParcelizer.mState == -1 && this.RemoteActionCompatParcelizer.mSavedFragmentState != null) {
            bundle.putAll(this.RemoteActionCompatParcelizer.mSavedFragmentState);
        }
        bundle.putParcelable(NotesDispatchAddressRequestKt.KEY_STATE, new FragmentState(this.RemoteActionCompatParcelizer));
        if (this.RemoteActionCompatParcelizer.mState >= 0) {
            Bundle bundle2 = new Bundle();
            this.RemoteActionCompatParcelizer.performSaveInstanceState(bundle2);
            if (!bundle2.isEmpty()) {
                bundle.putBundle("savedInstanceState", bundle2);
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, bundle2, false);
            Bundle bundle3 = new Bundle();
            this.RemoteActionCompatParcelizer.mSavedStateRegistryController.RemoteActionCompatParcelizer(bundle3);
            if (!bundle3.isEmpty()) {
                bundle.putBundle("registryState", bundle3);
            }
            Bundle bundleOnPrepareFromMediaId = this.RemoteActionCompatParcelizer.mChildFragmentManager.onPrepareFromMediaId();
            if (!bundleOnPrepareFromMediaId.isEmpty()) {
                bundle.putBundle("childFragmentManager", bundleOnPrepareFromMediaId);
            }
            if (this.RemoteActionCompatParcelizer.mView != null) {
                onCustomAction();
            }
            if (this.RemoteActionCompatParcelizer.mSavedViewState != null) {
                bundle.putSparseParcelableArray("viewState", this.RemoteActionCompatParcelizer.mSavedViewState);
            }
            if (this.RemoteActionCompatParcelizer.mSavedViewRegistryState != null) {
                bundle.putBundle("viewRegistryState", this.RemoteActionCompatParcelizer.mSavedViewRegistryState);
            }
        }
        if (this.RemoteActionCompatParcelizer.mArguments != null) {
            bundle.putBundle("arguments", this.RemoteActionCompatParcelizer.mArguments);
        }
        return bundle;
    }

    public final Fragment.SavedState AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.mState >= 0) {
            return new Fragment.SavedState(MediaBrowserCompatItemReceiver());
        }
        return null;
    }

    private void onCustomAction() {
        if (this.RemoteActionCompatParcelizer.mView != null) {
            if (FragmentManager.write(2)) {
                Objects.toString(this.RemoteActionCompatParcelizer);
                Objects.toString(this.RemoteActionCompatParcelizer.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.RemoteActionCompatParcelizer.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.RemoteActionCompatParcelizer.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.RemoteActionCompatParcelizer.mViewLifecycleOwner.read(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            this.RemoteActionCompatParcelizer.mSavedViewRegistryState = bundle;
        }
    }

    private void RatingCompat() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer.mContainer != null && this.RemoteActionCompatParcelizer.mView != null) {
            this.RemoteActionCompatParcelizer.mContainer.removeView(this.RemoteActionCompatParcelizer.mView);
        }
        this.RemoteActionCompatParcelizer.performDestroyView();
        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, false);
        this.RemoteActionCompatParcelizer.mContainer = null;
        this.RemoteActionCompatParcelizer.mView = null;
        this.RemoteActionCompatParcelizer.mViewLifecycleOwner = null;
        this.RemoteActionCompatParcelizer.mViewLifecycleOwnerLiveData.IconCompatParcelizer(null);
        this.RemoteActionCompatParcelizer.mInLayout = false;
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        Fragment fragmentWrite;
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = this.RemoteActionCompatParcelizer.mRemoving && !this.RemoteActionCompatParcelizer.isInBackStack();
        if (z && !this.RemoteActionCompatParcelizer.mBeingSaved) {
            this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer.mWho, null);
        }
        if (z || this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            pessimisticallyValidateBounds<?> pessimisticallyvalidatebounds = this.RemoteActionCompatParcelizer.mHost;
            if (pessimisticallyvalidatebounds instanceof TypeResolutionContext) {
                zIsChangingConfigurations = this.write.MediaBrowserCompatItemReceiver().read();
            } else if (pessimisticallyvalidatebounds.getRead() instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) pessimisticallyvalidatebounds.getRead()).isChangingConfigurations();
            }
            if ((z && !this.RemoteActionCompatParcelizer.mBeingSaved) || zIsChangingConfigurations) {
                this.write.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, false);
            }
            this.RemoteActionCompatParcelizer.performDestroy();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, false);
            for (_addSetterMethod _addsettermethod : this.write.write()) {
                if (_addsettermethod != null) {
                    Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                    if (this.RemoteActionCompatParcelizer.mWho.equals(fragmentIconCompatParcelizer.mTargetWho)) {
                        fragmentIconCompatParcelizer.mTarget = this.RemoteActionCompatParcelizer;
                        fragmentIconCompatParcelizer.mTargetWho = null;
                    }
                }
            }
            if (this.RemoteActionCompatParcelizer.mTargetWho != null) {
                Fragment fragment = this.RemoteActionCompatParcelizer;
                fragment.mTarget = this.write.write(fragment.mTargetWho);
            }
            this.write.RemoteActionCompatParcelizer(this);
            return;
        }
        if (this.RemoteActionCompatParcelizer.mTargetWho != null && (fragmentWrite = this.write.write(this.RemoteActionCompatParcelizer.mTargetWho)) != null && fragmentWrite.mRetainInstance) {
            this.RemoteActionCompatParcelizer.mTarget = fragmentWrite;
        }
        this.RemoteActionCompatParcelizer.mState = 0;
    }

    private void MediaBrowserCompatMediaItem() {
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer.performDetach();
        this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, false);
        this.RemoteActionCompatParcelizer.mState = -1;
        this.RemoteActionCompatParcelizer.mHost = null;
        this.RemoteActionCompatParcelizer.mParentFragment = null;
        this.RemoteActionCompatParcelizer.mFragmentManager = null;
        if ((!this.RemoteActionCompatParcelizer.mRemoving || this.RemoteActionCompatParcelizer.isInBackStack()) && !this.write.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            return;
        }
        if (FragmentManager.write(3)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer.initState();
    }

    public final void write() {
        Fragment fragmentAudioAttributesCompatParcelizer = FragmentManager.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.mContainer);
        Fragment parentFragment = this.RemoteActionCompatParcelizer.getParentFragment();
        if (fragmentAudioAttributesCompatParcelizer != null && !fragmentAudioAttributesCompatParcelizer.equals(parentFragment)) {
            Fragment fragment = this.RemoteActionCompatParcelizer;
            getJsonValueAccessor.write(fragment, fragmentAudioAttributesCompatParcelizer, fragment.mContainerId);
        }
        this.RemoteActionCompatParcelizer.mContainer.addView(this.RemoteActionCompatParcelizer.mView, this.write.read(this.RemoteActionCompatParcelizer));
    }
}
