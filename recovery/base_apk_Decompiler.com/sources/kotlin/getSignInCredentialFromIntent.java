package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getSignInCredentialFromIntent;", "Lo/argCount;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSignInCredentialFromIntent extends argCount {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        String string;
        ArrayList<String> stringArrayList;
        toMagicModuleMetaRepoModel.write(p0, "");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("_title")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(CourseResponseKeyConstantsKt.KEY_INTRO_PARA) : null;
        Bundle arguments3 = getArguments();
        List<String> listRemoteActionCompatParcelizer = (arguments3 == null || (stringArrayList = arguments3.getStringArrayList("course_component_list")) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : stringArrayList;
        View viewInflate = p0.inflate(R.layout.dialog_course_learn_more_revamp, p1, false);
        ((TextView) viewInflate.findViewById(R.id.title)).setText(string);
        String str = string2;
        if (str == null || str.length() == 0) {
            View viewFindViewById = viewInflate.findViewById(R.id.intro);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById);
        } else {
            ((TextView) viewInflate.findViewById(R.id.intro)).setText(str);
            View viewFindViewById2 = viewInflate.findViewById(R.id.intro);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(viewFindViewById2);
        }
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            View viewFindViewById3 = viewInflate.findViewById(R.id.componentTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(viewFindViewById3);
        } else {
            View viewFindViewById4 = viewInflate.findViewById(R.id.componentTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(viewFindViewById4);
        }
        View viewFindViewById5 = viewInflate.findViewById(R.id.component_holder);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        linearLayout.removeAllViews();
        for (String str2 : listRemoteActionCompatParcelizer) {
            View viewInflate2 = getLayoutInflater().inflate(R.layout.layout_component_text_view_revamp, (ViewGroup) null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
            ((TextView) viewInflate2.findViewById(R.id.componentContent)).setText(str2);
            linearLayout.addView(viewInflate2);
        }
        ((TextView) viewInflate.findViewById(R.id.btn_okay)).setOnClickListener(new View.OnClickListener() { // from class: o.getPhoneNumberFromIntent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getSignInCredentialFromIntent.write(this.write);
            }
        });
        toMagicModuleMetaRepoModel.write(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getSignInCredentialFromIntent getsignincredentialfromintent) {
        getsignincredentialfromintent.dismiss();
    }

    /* JADX INFO: renamed from: o.getSignInCredentialFromIntent$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getSignInCredentialFromIntent$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "Lo/getSignInCredentialFromIntent;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lo/getSignInCredentialFromIntent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getSignInCredentialFromIntent IconCompatParcelizer(String p0, String p1, List<String> p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("course_component_list", (ArrayList) p2);
            bundle.putString("_title", p0);
            bundle.putString(CourseResponseKeyConstantsKt.KEY_INTRO_PARA, p1);
            getSignInCredentialFromIntent getsignincredentialfromintent = new getSignInCredentialFromIntent();
            getsignincredentialfromintent.setArguments(bundle);
            return getsignincredentialfromintent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
