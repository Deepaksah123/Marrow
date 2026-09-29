package kotlin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import kotlin._doAddInjectable;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
public final class _refinePropertyInclusion extends _doAddInjectable implements FragmentManager.write {
    final FragmentManager IconCompatParcelizer;
    private boolean onAddQueueItem;
    public boolean read;
    public int write;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.write >= 0) {
            sb.append(" #");
            sb.append(this.write);
        }
        if (this.RatingCompat != null) {
            sb.append(" ");
            sb.append(this.RatingCompat);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void IconCompatParcelizer(String str, PrintWriter printWriter) {
        AudioAttributesCompatParcelizer(str, printWriter, true);
    }

    public final void AudioAttributesCompatParcelizer(String str, PrintWriter printWriter, boolean z) {
        String string;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.RatingCompat);
            printWriter.print(" mIndex=");
            printWriter.print(this.write);
            printWriter.print(" mCommitted=");
            printWriter.println(this.read);
            if (this.onCommand != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.onCommand));
            }
            if (this.AudioAttributesImplApi26Parcelizer != 0 || this.MediaBrowserCompatSearchResultReceiver != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.AudioAttributesImplApi26Parcelizer));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.MediaBrowserCompatSearchResultReceiver));
            }
            if (this.MediaBrowserCompatMediaItem != 0 || this.MediaMetadataCompat != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.MediaBrowserCompatMediaItem));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.MediaMetadataCompat));
            }
            if (this.MediaBrowserCompatItemReceiver != 0 || this.AudioAttributesImplBaseParcelizer != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.MediaBrowserCompatItemReceiver));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.AudioAttributesImplBaseParcelizer);
            }
            if (this.AudioAttributesCompatParcelizer != 0 || this.MediaBrowserCompatCustomActionResultReceiver != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.AudioAttributesCompatParcelizer));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
        if (this.MediaDescriptionCompat.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.MediaDescriptionCompat.size();
        for (int i = 0; i < size; i++) {
            _doAddInjectable.write writeVar = this.MediaDescriptionCompat.get(i);
            switch (writeVar.AudioAttributesCompatParcelizer) {
                case 0:
                    string = "NULL";
                    break;
                case 1:
                    string = "ADD";
                    break;
                case 2:
                    string = "REPLACE";
                    break;
                case 3:
                    string = "REMOVE";
                    break;
                case 4:
                    string = "HIDE";
                    break;
                case 5:
                    string = "SHOW";
                    break;
                case 6:
                    string = "DETACH";
                    break;
                case 7:
                    string = "ATTACH";
                    break;
                case 8:
                    string = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    string = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    string = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sb = new StringBuilder("cmd=");
                    sb.append(writeVar.AudioAttributesCompatParcelizer);
                    string = sb.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(string);
            printWriter.print(" ");
            printWriter.println(writeVar.IconCompatParcelizer);
            if (z) {
                if (writeVar.write != 0 || writeVar.read != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(writeVar.write));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(writeVar.read));
                }
                if (writeVar.MediaBrowserCompatCustomActionResultReceiver != 0 || writeVar.AudioAttributesImplApi26Parcelizer != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(writeVar.MediaBrowserCompatCustomActionResultReceiver));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(writeVar.AudioAttributesImplApi26Parcelizer));
                }
            }
        }
    }

    public _refinePropertyInclusion(FragmentManager fragmentManager) {
        super(fragmentManager.onCommand(), fragmentManager.onPlay() != null ? fragmentManager.onPlay().getRead().getClassLoader() : null);
        this.write = -1;
        this.onAddQueueItem = false;
        this.IconCompatParcelizer = fragmentManager;
    }

    @Override // kotlin._doAddInjectable
    final void IconCompatParcelizer(int i, Fragment fragment, String str, int i2) {
        super.IconCompatParcelizer(i, fragment, str, i2);
        fragment.mFragmentManager = this.IconCompatParcelizer;
    }

    @Override // kotlin._doAddInjectable
    public final _doAddInjectable read(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.read(fragment);
    }

    @Override // kotlin._doAddInjectable
    public final _doAddInjectable AudioAttributesCompatParcelizer(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.AudioAttributesCompatParcelizer(fragment);
    }

    @Override // kotlin._doAddInjectable
    public final _doAddInjectable IconCompatParcelizer(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.IconCompatParcelizer(fragment);
    }

    @Override // kotlin._doAddInjectable
    public final _doAddInjectable RemoteActionCompatParcelizer(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.RemoteActionCompatParcelizer(fragment);
    }

    @Override // kotlin._doAddInjectable
    public final _doAddInjectable RemoteActionCompatParcelizer(Fragment fragment, anyIgnorals.write writeVar) {
        if (fragment.mFragmentManager != this.IconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.IconCompatParcelizer);
            throw new IllegalArgumentException(sb.toString());
        }
        if (writeVar == anyIgnorals.write.IconCompatParcelizer && fragment.mState >= 0) {
            StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb2.append(writeVar);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (writeVar == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            StringBuilder sb3 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb3.append(writeVar);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        }
        return super.RemoteActionCompatParcelizer(fragment, writeVar);
    }

    public final void write(int i) {
        if (this.RemoteActionCompatParcelizer) {
            if (FragmentManager.write(2)) {
                toString();
            }
            int size = this.MediaDescriptionCompat.size();
            for (int i2 = 0; i2 < size; i2++) {
                _doAddInjectable.write writeVar = this.MediaDescriptionCompat.get(i2);
                if (writeVar.IconCompatParcelizer != null) {
                    writeVar.IconCompatParcelizer.mBackStackNesting += i;
                    if (FragmentManager.write(2)) {
                        Objects.toString(writeVar.IconCompatParcelizer);
                        int i3 = writeVar.IconCompatParcelizer.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer.size(); i++) {
                this.AudioAttributesImplApi21Parcelizer.get(i).run();
            }
            this.AudioAttributesImplApi21Parcelizer = null;
        }
    }

    @Override // kotlin._doAddInjectable
    public final int write() {
        return AudioAttributesCompatParcelizer(false, true);
    }

    @Override // kotlin._doAddInjectable
    public final int read() {
        return AudioAttributesCompatParcelizer(true, true);
    }

    @Override // kotlin._doAddInjectable
    public final void RemoteActionCompatParcelizer() {
        MediaMetadataCompat();
        this.IconCompatParcelizer.read((FragmentManager.write) this, false);
    }

    @Override // kotlin._doAddInjectable
    public final void IconCompatParcelizer() {
        MediaMetadataCompat();
        this.IconCompatParcelizer.read((FragmentManager.write) this, true);
    }

    public final int AudioAttributesCompatParcelizer(boolean z, boolean z2) {
        if (this.read) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.write(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new _replaceCreatorProperty("FragmentManager"));
            IconCompatParcelizer("  ", printWriter);
            printWriter.close();
        }
        this.read = true;
        if (this.RemoteActionCompatParcelizer) {
            this.write = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        } else {
            this.write = -1;
        }
        if (z2) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this, z);
        }
        return this.write;
    }

    @Override // androidx.fragment.app.FragmentManager.write
    public final boolean read(ArrayList<_refinePropertyInclusion> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.write(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.RemoteActionCompatParcelizer) {
            return true;
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        return true;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        int size = this.MediaDescriptionCompat.size();
        for (int i = 0; i < size; i++) {
            _doAddInjectable.write writeVar = this.MediaDescriptionCompat.get(i);
            Fragment fragment = writeVar.IconCompatParcelizer;
            if (fragment != null) {
                fragment.mBeingSaved = this.onAddQueueItem;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.onCommand);
                fragment.setSharedElementNames(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
            }
            switch (writeVar.AudioAttributesCompatParcelizer) {
                case 1:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, false);
                    this.IconCompatParcelizer.write(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(writeVar.AudioAttributesCompatParcelizer);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver(fragment);
                    break;
                case 4:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(fragment);
                    break;
                case 5:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, false);
                    FragmentManager.onAddQueueItem(fragment);
                    break;
                case 6:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(fragment);
                    break;
                case 7:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, false);
                    this.IconCompatParcelizer.IconCompatParcelizer(fragment);
                    break;
                case 8:
                    this.IconCompatParcelizer.onCustomAction(fragment);
                    break;
                case 9:
                    this.IconCompatParcelizer.onCustomAction(null);
                    break;
                case 10:
                    this.IconCompatParcelizer.IconCompatParcelizer(fragment, writeVar.RemoteActionCompatParcelizer);
                    break;
            }
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        for (int size = this.MediaDescriptionCompat.size() - 1; size >= 0; size--) {
            _doAddInjectable.write writeVar = this.MediaDescriptionCompat.get(size);
            Fragment fragment = writeVar.IconCompatParcelizer;
            if (fragment != null) {
                fragment.mBeingSaved = this.onAddQueueItem;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.IconCompatParcelizer(this.onCommand));
                fragment.setSharedElementNames(this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            switch (writeVar.AudioAttributesCompatParcelizer) {
                case 1:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, true);
                    this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(writeVar.AudioAttributesCompatParcelizer);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.write(fragment);
                    break;
                case 4:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    FragmentManager.onAddQueueItem(fragment);
                    break;
                case 5:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, true);
                    this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(fragment);
                    break;
                case 6:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.IconCompatParcelizer(fragment);
                    break;
                case 7:
                    fragment.setAnimations(writeVar.write, writeVar.read, writeVar.MediaBrowserCompatCustomActionResultReceiver, writeVar.AudioAttributesImplApi26Parcelizer);
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(fragment, true);
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(fragment);
                    break;
                case 8:
                    this.IconCompatParcelizer.onCustomAction(null);
                    break;
                case 9:
                    this.IconCompatParcelizer.onCustomAction(fragment);
                    break;
                case 10:
                    this.IconCompatParcelizer.IconCompatParcelizer(fragment, writeVar.MediaBrowserCompatItemReceiver);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment read(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r18
            r4 = r2
        L8:
            java.util.ArrayList<o._doAddInjectable$write> r5 = r0.MediaDescriptionCompat
            int r5 = r5.size()
            if (r4 >= r5) goto Lc3
            java.util.ArrayList<o._doAddInjectable$write> r5 = r0.MediaDescriptionCompat
            java.lang.Object r5 = r5.get(r4)
            o._doAddInjectable$write r5 = (o._doAddInjectable.write) r5
            int r6 = r5.AudioAttributesCompatParcelizer
            r7 = 1
            if (r6 == r7) goto Lba
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5d
            if (r6 == r10) goto L44
            r8 = 6
            if (r6 == r8) goto L44
            r8 = 7
            if (r6 == r8) goto Lba
            r8 = 8
            if (r6 == r8) goto L32
            goto Lbf
        L32:
            java.util.ArrayList<o._doAddInjectable$write> r6 = r0.MediaDescriptionCompat
            o._doAddInjectable$write r8 = new o._doAddInjectable$write
            r8.<init>(r11, r3, r2)
            r6.add(r4, r8)
            r5.AudioAttributesImplApi21Parcelizer = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.IconCompatParcelizer
            goto Lbf
        L44:
            androidx.fragment.app.Fragment r6 = r5.IconCompatParcelizer
            r1.remove(r6)
            androidx.fragment.app.Fragment r6 = r5.IconCompatParcelizer
            if (r6 != r3) goto Lbf
            java.util.ArrayList<o._doAddInjectable$write> r3 = r0.MediaDescriptionCompat
            o._doAddInjectable$write r6 = new o._doAddInjectable$write
            androidx.fragment.app.Fragment r5 = r5.IconCompatParcelizer
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbf
        L5d:
            androidx.fragment.app.Fragment r6 = r5.IconCompatParcelizer
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = r2
        L67:
            if (r12 < 0) goto La8
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La4
            if (r14 != r6) goto L77
            r13 = r7
            goto La4
        L77:
            if (r14 != r3) goto L86
            java.util.ArrayList<o._doAddInjectable$write> r3 = r0.MediaDescriptionCompat
            o._doAddInjectable$write r15 = new o._doAddInjectable$write
            r15.<init>(r11, r14, r2)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L86:
            o._doAddInjectable$write r15 = new o._doAddInjectable$write
            r15.<init>(r10, r14, r2)
            int r2 = r5.write
            r15.write = r2
            int r2 = r5.MediaBrowserCompatCustomActionResultReceiver
            r15.MediaBrowserCompatCustomActionResultReceiver = r2
            int r2 = r5.read
            r15.read = r2
            int r2 = r5.AudioAttributesImplApi26Parcelizer
            r15.AudioAttributesImplApi26Parcelizer = r2
            java.util.ArrayList<o._doAddInjectable$write> r2 = r0.MediaDescriptionCompat
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La4:
            int r12 = r12 + (-1)
            r2 = 0
            goto L67
        La8:
            if (r13 == 0) goto Lb2
            java.util.ArrayList<o._doAddInjectable$write> r2 = r0.MediaDescriptionCompat
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbf
        Lb2:
            r5.AudioAttributesCompatParcelizer = r7
            r5.AudioAttributesImplApi21Parcelizer = r7
            r1.add(r6)
            goto Lbf
        Lba:
            androidx.fragment.app.Fragment r2 = r5.IconCompatParcelizer
            r1.add(r2)
        Lbf:
            int r4 = r4 + r7
            r2 = 0
            goto L8
        Lc3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._refinePropertyInclusion.read(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment IconCompatParcelizer(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<o._doAddInjectable$write> r0 = r5.MediaDescriptionCompat
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<o._doAddInjectable$write> r2 = r5.MediaDescriptionCompat
            java.lang.Object r2 = r2.get(r0)
            o._doAddInjectable$write r2 = (o._doAddInjectable.write) r2
            int r3 = r2.AudioAttributesCompatParcelizer
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            o.anyIgnorals$write r3 = r2.MediaBrowserCompatItemReceiver
            r2.RemoteActionCompatParcelizer = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.IconCompatParcelizer
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.IconCompatParcelizer
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.IconCompatParcelizer
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._refinePropertyInclusion.IconCompatParcelizer(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public final void AudioAttributesCompatParcelizer() {
        int size = this.MediaDescriptionCompat.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            _doAddInjectable.write writeVar = this.MediaDescriptionCompat.get(size);
            if (writeVar.AudioAttributesImplApi21Parcelizer) {
                if (writeVar.AudioAttributesCompatParcelizer == 8) {
                    writeVar.AudioAttributesImplApi21Parcelizer = false;
                    size--;
                    this.MediaDescriptionCompat.remove(size);
                } else {
                    int i = writeVar.IconCompatParcelizer.mContainerId;
                    writeVar.AudioAttributesCompatParcelizer = 2;
                    writeVar.AudioAttributesImplApi21Parcelizer = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        _doAddInjectable.write writeVar2 = this.MediaDescriptionCompat.get(i2);
                        if (writeVar2.AudioAttributesImplApi21Parcelizer && writeVar2.IconCompatParcelizer.mContainerId == i) {
                            this.MediaDescriptionCompat.remove(i2);
                            size--;
                        }
                    }
                }
            }
        }
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.RatingCompat;
    }

    @Override // kotlin._doAddInjectable
    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat.isEmpty();
    }
}
