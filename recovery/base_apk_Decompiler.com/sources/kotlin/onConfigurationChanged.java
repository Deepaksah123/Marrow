package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.peekAvailableContext;
import kotlin.registerForActivityResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class onConfigurationChanged implements peekAvailableContext {
    public registerForActivityResult AudioAttributesCompatParcelizer;
    private LayoutInflater AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private LayoutInflater AudioAttributesImplBaseParcelizer;
    private peekAvailableContext.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    public Context RemoteActionCompatParcelizer;
    public onRequestPermissionsResult read;
    public Context write;

    @Override // kotlin.peekAvailableContext
    public boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    public abstract void read(onRetainNonConfigurationInstance onretainnonconfigurationinstance, registerForActivityResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    @Override // kotlin.peekAvailableContext
    public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    public boolean write(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return true;
    }

    public onConfigurationChanged(Context context, int i, int i2) {
        this.write = context;
        this.AudioAttributesImplApi21Parcelizer = LayoutInflater.from(context);
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
    }

    @Override // kotlin.peekAvailableContext
    public void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
        this.RemoteActionCompatParcelizer = context;
        this.AudioAttributesImplBaseParcelizer = LayoutInflater.from(context);
        this.read = onrequestpermissionsresult;
    }

    public registerForActivityResult RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        if (this.AudioAttributesCompatParcelizer == null) {
            registerForActivityResult registerforactivityresult = (registerForActivityResult) this.AudioAttributesImplApi21Parcelizer.inflate(this.AudioAttributesImplApi26Parcelizer, viewGroup, false);
            this.AudioAttributesCompatParcelizer = registerforactivityresult;
            registerforactivityresult.RemoteActionCompatParcelizer(this.read);
            AudioAttributesCompatParcelizer(true);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.peekAvailableContext
    public void AudioAttributesCompatParcelizer(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.AudioAttributesCompatParcelizer;
        if (viewGroup != null) {
            onRequestPermissionsResult onrequestpermissionsresult = this.read;
            int i = 0;
            if (onrequestpermissionsresult != null) {
                onrequestpermissionsresult.AudioAttributesCompatParcelizer();
                ArrayList<onRetainNonConfigurationInstance> arrayListMediaDescriptionCompat = this.read.MediaDescriptionCompat();
                int size = arrayListMediaDescriptionCompat.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    onRetainNonConfigurationInstance onretainnonconfigurationinstance = arrayListMediaDescriptionCompat.get(i3);
                    if (write(onretainnonconfigurationinstance)) {
                        View childAt = viewGroup.getChildAt(i2);
                        onRetainNonConfigurationInstance onretainnonconfigurationinstanceIconCompatParcelizer = childAt instanceof registerForActivityResult.AudioAttributesCompatParcelizer ? ((registerForActivityResult.AudioAttributesCompatParcelizer) childAt).IconCompatParcelizer() : null;
                        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(onretainnonconfigurationinstance, childAt, viewGroup);
                        if (onretainnonconfigurationinstance != onretainnonconfigurationinstanceIconCompatParcelizer) {
                            viewRemoteActionCompatParcelizer.setPressed(false);
                            viewRemoteActionCompatParcelizer.jumpDrawablesToCurrentState();
                        }
                        if (viewRemoteActionCompatParcelizer != childAt) {
                            RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!AudioAttributesCompatParcelizer(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.AudioAttributesCompatParcelizer).addView(view, i);
    }

    public boolean AudioAttributesCompatParcelizer(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public final peekAvailableContext.AudioAttributesCompatParcelizer read() {
        return this.IconCompatParcelizer;
    }

    private registerForActivityResult.AudioAttributesCompatParcelizer write(ViewGroup viewGroup) {
        return (registerForActivityResult.AudioAttributesCompatParcelizer) this.AudioAttributesImplApi21Parcelizer.inflate(this.MediaBrowserCompatCustomActionResultReceiver, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance, View view, ViewGroup viewGroup) {
        registerForActivityResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite;
        if (view instanceof registerForActivityResult.AudioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizerWrite = (registerForActivityResult.AudioAttributesCompatParcelizer) view;
        } else {
            audioAttributesCompatParcelizerWrite = write(viewGroup);
        }
        read(onretainnonconfigurationinstance, audioAttributesCompatParcelizerWrite);
        return (View) audioAttributesCompatParcelizerWrite;
    }

    @Override // kotlin.peekAvailableContext
    public void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.IconCompatParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, z);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.peekAvailableContext
    public boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.IconCompatParcelizer;
        onRequestPermissionsResult onrequestpermissionsresult = removeontrimmemorylistener;
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        if (removeontrimmemorylistener == null) {
            onrequestpermissionsresult = this.read;
        }
        return audioAttributesCompatParcelizer.read(onrequestpermissionsresult);
    }

    @Override // kotlin.peekAvailableContext
    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void read(int i) {
        this.MediaBrowserCompatItemReceiver = i;
    }
}
