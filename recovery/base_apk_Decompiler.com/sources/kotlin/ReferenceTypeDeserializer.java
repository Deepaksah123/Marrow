package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ReferenceTypeDeserializer {
    public String AudioAttributesCompatParcelizer;
    private static final int[] read = {0, 4, 8};
    private static SparseIntArray IconCompatParcelizer = new SparseIntArray();
    private static SparseIntArray AudioAttributesImplApi21Parcelizer = new SparseIntArray();
    public String write = "";
    public int RemoteActionCompatParcelizer = 0;
    private HashMap<String, StackTraceElementDeserializer> MediaBrowserCompatItemReceiver = new HashMap<>();
    private boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private HashMap<Integer, write> AudioAttributesImplApi26Parcelizer = new HashMap<>();

    static {
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintLeft_toLeftOf, 25);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintLeft_toRightOf, 26);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintRight_toLeftOf, 29);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintRight_toRightOf, 30);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintTop_toTopOf, 36);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintTop_toBottomOf, 35);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBottom_toTopOf, 4);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBottom_toBottomOf, 3);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBaseline_toTopOf, 91);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBaseline_toBottomOf, 92);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_editor_absoluteX, 6);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_editor_absoluteY, 7);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintGuide_begin, 17);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintGuide_end, 18);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintGuide_percent, 19);
        IconCompatParcelizer.append(_isBlank.read.Constraint_guidelineUseRtl, 99);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_orientation, 27);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintStart_toEndOf, 32);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintStart_toStartOf, 33);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintEnd_toStartOf, 10);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintEnd_toEndOf, 9);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginLeft, 13);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginTop, 16);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginRight, 14);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginBottom, 11);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginStart, 15);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_goneMarginEnd, 12);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintVertical_weight, 40);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHorizontal_weight, 39);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHorizontal_chainStyle, 41);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintVertical_chainStyle, 42);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHorizontal_bias, 20);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintVertical_bias, 37);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintDimensionRatio, 5);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintLeft_creator, 87);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintTop_creator, 87);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintRight_creator, 87);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBottom_creator, 87);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintBaseline_creator, 87);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginLeft, 24);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginRight, 28);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginStart, 31);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginEnd, 8);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginTop, 34);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_marginBottom, 2);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_width, 23);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_layout_height, 21);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintWidth, 95);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHeight, 96);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_visibility, 22);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_alpha, 43);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_elevation, 44);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_rotationX, 45);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_rotationY, 46);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_rotation, 60);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_scaleX, 47);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_scaleY, 48);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_transformPivotX, 49);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_transformPivotY, 50);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_translationX, 51);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_translationY, 52);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_translationZ, 53);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintWidth_default, 54);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHeight_default, 55);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintWidth_max, 56);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHeight_max, 57);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintWidth_min, 58);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHeight_min, 59);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintCircle, 61);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintCircleRadius, 62);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintCircleAngle, 63);
        IconCompatParcelizer.append(_isBlank.read.Constraint_animateRelativeTo, 64);
        IconCompatParcelizer.append(_isBlank.read.Constraint_transitionEasing, 65);
        IconCompatParcelizer.append(_isBlank.read.Constraint_drawPath, 66);
        IconCompatParcelizer.append(_isBlank.read.Constraint_transitionPathRotate, 67);
        IconCompatParcelizer.append(_isBlank.read.Constraint_motionStagger, 79);
        IconCompatParcelizer.append(_isBlank.read.Constraint_android_id, 38);
        IconCompatParcelizer.append(_isBlank.read.Constraint_motionProgress, 68);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintWidth_percent, 69);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintHeight_percent, 70);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_wrapBehaviorInParent, 97);
        IconCompatParcelizer.append(_isBlank.read.Constraint_chainUseRtl, 71);
        IconCompatParcelizer.append(_isBlank.read.Constraint_barrierDirection, 72);
        IconCompatParcelizer.append(_isBlank.read.Constraint_barrierMargin, 73);
        IconCompatParcelizer.append(_isBlank.read.Constraint_constraint_referenced_ids, 74);
        IconCompatParcelizer.append(_isBlank.read.Constraint_barrierAllowsGoneWidgets, 75);
        IconCompatParcelizer.append(_isBlank.read.Constraint_pathMotionArc, 76);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constraintTag, 77);
        IconCompatParcelizer.append(_isBlank.read.Constraint_visibilityMode, 78);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constrainedWidth, 80);
        IconCompatParcelizer.append(_isBlank.read.Constraint_layout_constrainedHeight, 81);
        IconCompatParcelizer.append(_isBlank.read.Constraint_polarRelativeTo, 82);
        IconCompatParcelizer.append(_isBlank.read.Constraint_transformPivotTarget, 83);
        IconCompatParcelizer.append(_isBlank.read.Constraint_quantizeMotionSteps, 84);
        IconCompatParcelizer.append(_isBlank.read.Constraint_quantizeMotionPhase, 85);
        IconCompatParcelizer.append(_isBlank.read.Constraint_quantizeMotionInterpolator, 86);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_editor_absoluteY, 6);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_editor_absoluteY, 7);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_orientation, 27);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginLeft, 13);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginTop, 16);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginRight, 14);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginBottom, 11);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginStart, 15);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_goneMarginEnd, 12);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintVertical_weight, 40);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintVertical_bias, 37);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintDimensionRatio, 5);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintLeft_creator, 87);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintTop_creator, 87);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintRight_creator, 87);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintBottom_creator, 87);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintBaseline_creator, 87);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginLeft, 24);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginRight, 28);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginStart, 31);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginEnd, 8);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginTop, 34);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_marginBottom, 2);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_width, 23);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_layout_height, 21);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintWidth, 95);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHeight, 96);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_visibility, 22);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_alpha, 43);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_elevation, 44);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_rotationX, 45);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_rotationY, 46);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_rotation, 60);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_scaleX, 47);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_scaleY, 48);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_transformPivotX, 49);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_transformPivotY, 50);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_translationX, 51);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_translationY, 52);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_translationZ, 53);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintWidth_default, 54);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHeight_default, 55);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintWidth_max, 56);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHeight_max, 57);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintWidth_min, 58);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHeight_min, 59);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintCircleRadius, 62);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintCircleAngle, 63);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_animateRelativeTo, 64);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_transitionEasing, 65);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_drawPath, 66);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_transitionPathRotate, 67);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_motionStagger, 79);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_android_id, 38);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_motionTarget, 98);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_motionProgress, 68);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintWidth_percent, 69);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintHeight_percent, 70);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_chainUseRtl, 71);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_barrierDirection, 72);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_barrierMargin, 73);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_constraint_referenced_ids, 74);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_pathMotionArc, 76);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constraintTag, 77);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_visibilityMode, 78);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constrainedWidth, 80);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_constrainedHeight, 81);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_polarRelativeTo, 82);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_transformPivotTarget, 83);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_quantizeMotionSteps, 84);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_quantizeMotionPhase, 85);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_quantizeMotionInterpolator, 86);
        AudioAttributesImplApi21Parcelizer.append(_isBlank.read.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public final write IconCompatParcelizer(int i) {
        return AudioAttributesImplBaseParcelizer(i);
    }

    public final void read(ReferenceTypeDeserializer referenceTypeDeserializer) {
        for (Integer num : referenceTypeDeserializer.AudioAttributesImplApi26Parcelizer.keySet()) {
            int iIntValue = num.intValue();
            write writeVar = referenceTypeDeserializer.AudioAttributesImplApi26Parcelizer.get(num);
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(iIntValue))) {
                this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(iIntValue), new write());
            }
            write writeVar2 = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(iIntValue));
            if (writeVar2 != null) {
                if (!writeVar2.write.onSetRepeatMode) {
                    writeVar2.write.read(writeVar.write);
                }
                if (!writeVar2.AudioAttributesImplApi26Parcelizer.write) {
                    writeVar2.AudioAttributesImplApi26Parcelizer.read(writeVar.AudioAttributesImplApi26Parcelizer);
                }
                if (!writeVar2.MediaBrowserCompatCustomActionResultReceiver.read) {
                    writeVar2.MediaBrowserCompatCustomActionResultReceiver.write(writeVar.MediaBrowserCompatCustomActionResultReceiver);
                }
                if (!writeVar2.AudioAttributesImplBaseParcelizer.write) {
                    writeVar2.AudioAttributesImplBaseParcelizer.read(writeVar.AudioAttributesImplBaseParcelizer);
                }
                for (String str : writeVar.read.keySet()) {
                    if (!writeVar2.read.containsKey(str)) {
                        writeVar2.read.put(str, writeVar.read.get(str));
                    }
                }
            }
        }
    }

    public final void read(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.MediaBrowserCompatCustomActionResultReceiver && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(id), new write());
            }
            write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id));
            if (writeVar != null) {
                if (!writeVar.write.onSetRepeatMode) {
                    writeVar.write(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        writeVar.write.PlaybackStateCompat = ((ConstraintHelper) childAt).AudioAttributesImplApi26Parcelizer();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            writeVar.write.onSkipToNext = barrier.RemoteActionCompatParcelizer();
                            writeVar.write.onStop = barrier.IconCompatParcelizer();
                            writeVar.write.onSkipToPrevious = barrier.read();
                        }
                    }
                    writeVar.write.onSetRepeatMode = true;
                }
                if (!writeVar.AudioAttributesImplApi26Parcelizer.write) {
                    writeVar.AudioAttributesImplApi26Parcelizer.read = childAt.getVisibility();
                    writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = childAt.getAlpha();
                    writeVar.AudioAttributesImplApi26Parcelizer.write = true;
                }
                if (!writeVar.MediaBrowserCompatCustomActionResultReceiver.read) {
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.read = true;
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer = childAt.getRotation();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = childAt.getRotationX();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer = childAt.getRotationY();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = childAt.getScaleX();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver = pivotX;
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem = pivotY;
                    }
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat = childAt.getTranslationX();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = childAt.getTranslationY();
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver = childAt.getTranslationZ();
                    if (writeVar.MediaBrowserCompatCustomActionResultReceiver.write) {
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = childAt.getElevation();
                    }
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(ReferenceTypeDeserializer referenceTypeDeserializer) {
        for (write writeVar : referenceTypeDeserializer.AudioAttributesImplApi26Parcelizer.values()) {
            if (writeVar.IconCompatParcelizer != null) {
                if (writeVar.RemoteActionCompatParcelizer != null) {
                    Iterator<Integer> it = this.AudioAttributesImplApi26Parcelizer.keySet().iterator();
                    while (it.hasNext()) {
                        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(it.next().intValue());
                        if (writeVarRemoteActionCompatParcelizer.write.onSkipToQueueItem != null && writeVar.RemoteActionCompatParcelizer.matches(writeVarRemoteActionCompatParcelizer.write.onSkipToQueueItem)) {
                            writeVar.IconCompatParcelizer.RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                            writeVarRemoteActionCompatParcelizer.read.putAll((HashMap) writeVar.read.clone());
                        }
                    }
                } else {
                    writeVar.IconCompatParcelizer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void IconCompatParcelizer(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 == 0) goto L75
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6e
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L25
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L21
            r6 = -3
            if (r5 == r6) goto L1f
            if (r5 == r0) goto L29
            r6 = -1
            if (r5 == r6) goto L29
        L1f:
            r5 = r2
            goto L2c
        L21:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2c
        L25:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L29:
            r3 = r2
            r2 = r5
            r5 = r3
        L2c:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L3e
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            if (r7 != 0) goto L39
            r4.width = r2
            r4.MediaMetadataCompat = r5
            return
        L39:
            r4.height = r2
            r4.AudioAttributesImplApi26Parcelizer = r5
            return
        L3e:
            boolean r6 = r4 instanceof o.ReferenceTypeDeserializer.IconCompatParcelizer
            if (r6 == 0) goto L50
            o.ReferenceTypeDeserializer$IconCompatParcelizer r4 = (o.ReferenceTypeDeserializer.IconCompatParcelizer) r4
            if (r7 != 0) goto L4b
            r4.MediaSessionCompatResultReceiverWrapper = r2
            r4.RatingCompat = r5
            return
        L4b:
            r4.setSessionImpl = r2
            r4.MediaMetadataCompat = r5
            return
        L50:
            boolean r6 = r4 instanceof o.ReferenceTypeDeserializer.write.read
            if (r6 == 0) goto L75
            o.ReferenceTypeDeserializer$write$read r4 = (o.ReferenceTypeDeserializer.write.read) r4
            if (r7 != 0) goto L63
            r6 = 23
            r4.RemoteActionCompatParcelizer(r6, r2)
            r6 = 80
            r4.read(r6, r5)
            return
        L63:
            r6 = 21
            r4.RemoteActionCompatParcelizer(r6, r2)
            r6 = 81
            r4.read(r6, r5)
            goto L75
        L6e:
            java.lang.String r5 = r5.getString(r6)
            write(r4, r5, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ReferenceTypeDeserializer.IconCompatParcelizer(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void read(ConstraintLayout.LayoutParams layoutParams, String str) {
        float fAbs = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                    String strSubstring2 = str.substring(i2, iIndexOf2);
                    String strSubstring3 = str.substring(iIndexOf2 + 1);
                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                        float f = Float.parseFloat(strSubstring2);
                        float f2 = Float.parseFloat(strSubstring3);
                        if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
                            if (i == 1) {
                                fAbs = Math.abs(f2 / f);
                                i = 1;
                            } else {
                                fAbs = Math.abs(f / f2);
                            }
                        }
                    }
                } else {
                    String strSubstring4 = str.substring(i2);
                    if (strSubstring4.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.MediaBrowserCompatMediaItem = str;
        layoutParams.RatingCompat = fAbs;
        layoutParams.MediaBrowserCompatSearchResultReceiver = i;
    }

    private static void write(Object obj, String str, int i) {
        if (str != null) {
            int iIndexOf = str.indexOf(61);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.LayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.LayoutParams) layoutParams).height = 0;
                        }
                        read(layoutParams, strTrim2);
                        return;
                    }
                    if (obj instanceof IconCompatParcelizer) {
                        ((IconCompatParcelizer) obj).MediaDescriptionCompat = strTrim2;
                        return;
                    } else {
                        if (obj instanceof write.read) {
                            ((write.read) obj).AudioAttributesCompatParcelizer(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.LayoutParams) layoutParams2).width = 0;
                                layoutParams2.onRemoveQueueItem = f;
                                return;
                            } else {
                                ((ViewGroup.LayoutParams) layoutParams2).height = 0;
                                layoutParams2.accessonBackPresseds1027565324 = f;
                                return;
                            }
                        }
                        if (obj instanceof IconCompatParcelizer) {
                            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                            if (i == 0) {
                                iconCompatParcelizer.MediaSessionCompatResultReceiverWrapper = 0;
                                iconCompatParcelizer.onSetRating = f;
                                return;
                            } else {
                                iconCompatParcelizer.setSessionImpl = 0;
                                iconCompatParcelizer._init_lambda4 = f;
                                return;
                            }
                        }
                        if (obj instanceof write.read) {
                            write.read readVar = (write.read) obj;
                            if (i == 0) {
                                readVar.RemoteActionCompatParcelizer(23, 0);
                                readVar.write(39, f);
                                return;
                            } else {
                                readVar.RemoteActionCompatParcelizer(21, 0);
                                readVar.write(40, f);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.LayoutParams) layoutParams3).width = 0;
                                layoutParams3.ParcelableVolumeInfo = fMax;
                                layoutParams3.onSkipToNext = 2;
                                return;
                            } else {
                                ((ViewGroup.LayoutParams) layoutParams3).height = 0;
                                layoutParams3.MediaSessionCompatToken = fMax;
                                layoutParams3.onStop = 2;
                                return;
                            }
                        }
                        if (obj instanceof IconCompatParcelizer) {
                            IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) obj;
                            if (i == 0) {
                                iconCompatParcelizer2.MediaSessionCompatResultReceiverWrapper = 0;
                                iconCompatParcelizer2.accessonBackPresseds1027565324 = fMax;
                                iconCompatParcelizer2.accessgetReportFullyDrawnExecutorp = 2;
                                return;
                            } else {
                                iconCompatParcelizer2.setSessionImpl = 0;
                                iconCompatParcelizer2.onRemoveQueueItem = fMax;
                                iconCompatParcelizer2.onPrepare = 2;
                                return;
                            }
                        }
                        if (obj instanceof write.read) {
                            write.read readVar2 = (write.read) obj;
                            if (i == 0) {
                                readVar2.RemoteActionCompatParcelizer(23, 0);
                                readVar2.RemoteActionCompatParcelizer(54, 2);
                            } else {
                                readVar2.RemoteActionCompatParcelizer(21, 0);
                                readVar2.RemoteActionCompatParcelizer(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    public static class IconCompatParcelizer {
        private static SparseIntArray ensureViewModelStore;
        public int MediaSessionCompatResultReceiverWrapper;
        public String MediaSessionCompatToken;
        public int[] PlaybackStateCompat;
        public String onSkipToQueueItem;
        public int setSessionImpl;
        public boolean MediaSessionCompatQueueItem = false;
        public boolean onSetRepeatMode = false;
        private boolean addObserverForBackInvokerlambda7 = false;
        public int onPlayFromUri = -1;
        public int onPrepareFromMediaId = -1;
        public float onPrepareFromSearch = -1.0f;
        public boolean onPlayFromSearch = true;
        public int onSetPlaybackSpeed = -1;
        public int onSetShuffleMode = -1;
        public int ResultReceiver = -1;
        public int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1;
        public int accessensureViewModelStore = -1;
        public int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
        public int AudioAttributesImplBaseParcelizer = -1;
        public int AudioAttributesImplApi26Parcelizer = -1;
        public int RemoteActionCompatParcelizer = -1;
        public int write = -1;
        public int AudioAttributesCompatParcelizer = -1;
        public int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
        public int _init_lambda3 = -1;
        public int onAddQueueItem = -1;
        public int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        public float onRewind = 0.5f;
        public float _init_lambda5 = 0.5f;
        public String MediaDescriptionCompat = null;
        public int MediaBrowserCompatItemReceiver = -1;
        public int AudioAttributesImplApi21Parcelizer = 0;
        public float MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        public int MediaBrowserCompatSearchResultReceiver = -1;
        public int MediaBrowserCompatMediaItem = -1;
        public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        public int onSetCaptioningEnabled = 0;
        public int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 0;
        public int r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = 0;
        public int read = 0;
        public int onCommand = 0;
        public int _init_lambda2 = 0;
        public int IconCompatParcelizer = 0;
        public int onMediaButtonEvent = Integer.MIN_VALUE;
        public int onPause = Integer.MIN_VALUE;
        public int onPlayFromMediaId = Integer.MIN_VALUE;
        public int handleMediaPlayPauseIfPendingOnHandler = Integer.MIN_VALUE;
        public int onFastForward = Integer.MIN_VALUE;
        public int onPlay = Integer.MIN_VALUE;
        public int onCustomAction = Integer.MIN_VALUE;
        public float _init_lambda4 = -1.0f;
        public float onSetRating = -1.0f;
        public int onPrepareFromUri = 0;
        public int accessaddObserverForBackInvoker = 0;
        public int accessgetReportFullyDrawnExecutorp = 0;
        public int onPrepare = 0;
        public int addObserverForBackInvoker = 0;
        public int onSeekTo = 0;
        public int createFullyDrawnExecutor = 0;
        public int onRemoveQueueItemAt = 0;
        public float accessonBackPresseds1027565324 = 1.0f;
        public float onRemoveQueueItem = 1.0f;
        public int onStop = -1;
        public int onSkipToPrevious = 0;
        public int ParcelableVolumeInfo = -1;
        public boolean RatingCompat = false;
        public boolean MediaMetadataCompat = false;
        public boolean onSkipToNext = true;
        public int PlaybackStateCompatCustomAction = 0;

        public final void read(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaSessionCompatQueueItem = iconCompatParcelizer.MediaSessionCompatQueueItem;
            this.MediaSessionCompatResultReceiverWrapper = iconCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
            this.onSetRepeatMode = iconCompatParcelizer.onSetRepeatMode;
            this.setSessionImpl = iconCompatParcelizer.setSessionImpl;
            this.onPlayFromUri = iconCompatParcelizer.onPlayFromUri;
            this.onPrepareFromMediaId = iconCompatParcelizer.onPrepareFromMediaId;
            this.onPrepareFromSearch = iconCompatParcelizer.onPrepareFromSearch;
            this.onPlayFromSearch = iconCompatParcelizer.onPlayFromSearch;
            this.onSetPlaybackSpeed = iconCompatParcelizer.onSetPlaybackSpeed;
            this.onSetShuffleMode = iconCompatParcelizer.onSetShuffleMode;
            this.ResultReceiver = iconCompatParcelizer.ResultReceiver;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = iconCompatParcelizer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            this.accessensureViewModelStore = iconCompatParcelizer.accessensureViewModelStore;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = iconCompatParcelizer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer;
            this.write = iconCompatParcelizer.write;
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = iconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            this._init_lambda3 = iconCompatParcelizer._init_lambda3;
            this.onAddQueueItem = iconCompatParcelizer.onAddQueueItem;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.onRewind = iconCompatParcelizer.onRewind;
            this._init_lambda5 = iconCompatParcelizer._init_lambda5;
            this.MediaDescriptionCompat = iconCompatParcelizer.MediaDescriptionCompat;
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizer.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            this.MediaBrowserCompatMediaItem = iconCompatParcelizer.MediaBrowserCompatMediaItem;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = iconCompatParcelizer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            this.onSetCaptioningEnabled = iconCompatParcelizer.onSetCaptioningEnabled;
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = iconCompatParcelizer.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = iconCompatParcelizer.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
            this.read = iconCompatParcelizer.read;
            this.onCommand = iconCompatParcelizer.onCommand;
            this._init_lambda2 = iconCompatParcelizer._init_lambda2;
            this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
            this.onMediaButtonEvent = iconCompatParcelizer.onMediaButtonEvent;
            this.onPause = iconCompatParcelizer.onPause;
            this.onPlayFromMediaId = iconCompatParcelizer.onPlayFromMediaId;
            this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
            this.onFastForward = iconCompatParcelizer.onFastForward;
            this.onPlay = iconCompatParcelizer.onPlay;
            this.onCustomAction = iconCompatParcelizer.onCustomAction;
            this._init_lambda4 = iconCompatParcelizer._init_lambda4;
            this.onSetRating = iconCompatParcelizer.onSetRating;
            this.onPrepareFromUri = iconCompatParcelizer.onPrepareFromUri;
            this.accessaddObserverForBackInvoker = iconCompatParcelizer.accessaddObserverForBackInvoker;
            this.accessgetReportFullyDrawnExecutorp = iconCompatParcelizer.accessgetReportFullyDrawnExecutorp;
            this.onPrepare = iconCompatParcelizer.onPrepare;
            this.addObserverForBackInvoker = iconCompatParcelizer.addObserverForBackInvoker;
            this.onSeekTo = iconCompatParcelizer.onSeekTo;
            this.createFullyDrawnExecutor = iconCompatParcelizer.createFullyDrawnExecutor;
            this.onRemoveQueueItemAt = iconCompatParcelizer.onRemoveQueueItemAt;
            this.accessonBackPresseds1027565324 = iconCompatParcelizer.accessonBackPresseds1027565324;
            this.onRemoveQueueItem = iconCompatParcelizer.onRemoveQueueItem;
            this.onStop = iconCompatParcelizer.onStop;
            this.onSkipToPrevious = iconCompatParcelizer.onSkipToPrevious;
            this.ParcelableVolumeInfo = iconCompatParcelizer.ParcelableVolumeInfo;
            this.onSkipToQueueItem = iconCompatParcelizer.onSkipToQueueItem;
            int[] iArr = iconCompatParcelizer.PlaybackStateCompat;
            if (iArr != null && iconCompatParcelizer.MediaSessionCompatToken == null) {
                this.PlaybackStateCompat = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.PlaybackStateCompat = null;
            }
            this.MediaSessionCompatToken = iconCompatParcelizer.MediaSessionCompatToken;
            this.RatingCompat = iconCompatParcelizer.RatingCompat;
            this.MediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat;
            this.onSkipToNext = iconCompatParcelizer.onSkipToNext;
            this.PlaybackStateCompatCustomAction = iconCompatParcelizer.PlaybackStateCompatCustomAction;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            ensureViewModelStore = sparseIntArray;
            sparseIntArray.append(_isBlank.read.Layout_layout_constraintLeft_toLeftOf, 24);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintLeft_toRightOf, 25);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintRight_toLeftOf, 28);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintRight_toRightOf, 29);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintTop_toTopOf, 35);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintTop_toBottomOf, 34);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintBottom_toTopOf, 4);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintBottom_toBottomOf, 3);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintBaseline_toBaselineOf, 1);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_editor_absoluteX, 6);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_editor_absoluteY, 7);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintGuide_begin, 17);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintGuide_end, 18);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintGuide_percent, 19);
            ensureViewModelStore.append(_isBlank.read.Layout_guidelineUseRtl, 90);
            ensureViewModelStore.append(_isBlank.read.Layout_android_orientation, 26);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintStart_toEndOf, 31);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintStart_toStartOf, 32);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintEnd_toStartOf, 10);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintEnd_toEndOf, 9);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginLeft, 13);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginTop, 16);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginRight, 14);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginBottom, 11);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginStart, 15);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_goneMarginEnd, 12);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintVertical_weight, 38);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintHorizontal_weight, 37);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintHorizontal_chainStyle, 39);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintVertical_chainStyle, 40);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintHorizontal_bias, 20);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintVertical_bias, 36);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintDimensionRatio, 5);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintLeft_creator, 91);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintTop_creator, 91);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintRight_creator, 91);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintBottom_creator, 91);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintBaseline_creator, 91);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginLeft, 23);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginRight, 27);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginStart, 30);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginEnd, 8);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginTop, 33);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_marginBottom, 2);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_width, 22);
            ensureViewModelStore.append(_isBlank.read.Layout_android_layout_height, 21);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintWidth, 41);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintHeight, 42);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constrainedWidth, 41);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constrainedHeight, 42);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_wrapBehaviorInParent, 76);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintCircle, 61);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintCircleRadius, 62);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintCircleAngle, 63);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintWidth_percent, 69);
            ensureViewModelStore.append(_isBlank.read.Layout_layout_constraintHeight_percent, 70);
            ensureViewModelStore.append(_isBlank.read.Layout_chainUseRtl, 71);
            ensureViewModelStore.append(_isBlank.read.Layout_barrierDirection, 72);
            ensureViewModelStore.append(_isBlank.read.Layout_barrierMargin, 73);
            ensureViewModelStore.append(_isBlank.read.Layout_constraint_referenced_ids, 74);
            ensureViewModelStore.append(_isBlank.read.Layout_barrierAllowsGoneWidgets, 75);
        }

        final void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.Layout);
            this.onSetRepeatMode = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = ensureViewModelStore.get(index);
                switch (i2) {
                    case 1:
                        this.RemoteActionCompatParcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.RemoteActionCompatParcelizer);
                        break;
                    case 2:
                        this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.read);
                        break;
                    case 3:
                        this.AudioAttributesImplApi26Parcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 4:
                        this.AudioAttributesImplBaseParcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.AudioAttributesImplBaseParcelizer);
                        break;
                    case 5:
                        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 7:
                        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaBrowserCompatMediaItem);
                        break;
                    case 8:
                        this.onCommand = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onCommand);
                        break;
                    case 9:
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        break;
                    case 10:
                        this.onAddQueueItem = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.onAddQueueItem);
                        break;
                    case 11:
                        this.handleMediaPlayPauseIfPendingOnHandler = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.handleMediaPlayPauseIfPendingOnHandler);
                        break;
                    case 12:
                        this.onFastForward = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onFastForward);
                        break;
                    case 13:
                        this.onMediaButtonEvent = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onMediaButtonEvent);
                        break;
                    case 14:
                        this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPlayFromMediaId);
                        break;
                    case 15:
                        this.onPlay = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPlay);
                        break;
                    case 16:
                        this.onPause = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onPause);
                        break;
                    case 17:
                        this.onPlayFromUri = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onPlayFromUri);
                        break;
                    case 18:
                        this.onPrepareFromMediaId = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.onPrepareFromMediaId);
                        break;
                    case 19:
                        this.onPrepareFromSearch = typedArrayObtainStyledAttributes.getFloat(index, this.onPrepareFromSearch);
                        break;
                    case 20:
                        this.onRewind = typedArrayObtainStyledAttributes.getFloat(index, this.onRewind);
                        break;
                    case 21:
                        this.setSessionImpl = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.setSessionImpl);
                        break;
                    case 22:
                        this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.MediaSessionCompatResultReceiverWrapper);
                        break;
                    case 23:
                        this.onSetCaptioningEnabled = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onSetCaptioningEnabled);
                        break;
                    case 24:
                        this.onSetPlaybackSpeed = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.onSetPlaybackSpeed);
                        break;
                    case 25:
                        this.onSetShuffleMode = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.onSetShuffleMode);
                        break;
                    case 26:
                        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayObtainStyledAttributes.getInt(index, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        break;
                    case 27:
                        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
                        break;
                    case 28:
                        this.ResultReceiver = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.ResultReceiver);
                        break;
                    case 29:
                        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
                        break;
                    case 30:
                        this._init_lambda2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this._init_lambda2);
                        break;
                    case 31:
                        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
                        break;
                    case 32:
                        this._init_lambda3 = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this._init_lambda3);
                        break;
                    case 33:
                        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
                        break;
                    case 34:
                        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                        break;
                    case 35:
                        this.accessensureViewModelStore = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.accessensureViewModelStore);
                        break;
                    case 36:
                        this._init_lambda5 = typedArrayObtainStyledAttributes.getFloat(index, this._init_lambda5);
                        break;
                    case 37:
                        this.onSetRating = typedArrayObtainStyledAttributes.getFloat(index, this.onSetRating);
                        break;
                    case 38:
                        this._init_lambda4 = typedArrayObtainStyledAttributes.getFloat(index, this._init_lambda4);
                        break;
                    case 39:
                        this.onPrepareFromUri = typedArrayObtainStyledAttributes.getInt(index, this.onPrepareFromUri);
                        break;
                    case 40:
                        this.accessaddObserverForBackInvoker = typedArrayObtainStyledAttributes.getInt(index, this.accessaddObserverForBackInvoker);
                        break;
                    case 41:
                        ReferenceTypeDeserializer.IconCompatParcelizer(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ReferenceTypeDeserializer.IconCompatParcelizer(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.MediaBrowserCompatItemReceiver = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.MediaBrowserCompatItemReceiver);
                                break;
                            case 62:
                                this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.AudioAttributesImplApi21Parcelizer);
                                break;
                            case 63:
                                this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatCustomActionResultReceiver);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.accessonBackPresseds1027565324 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.onRemoveQueueItem = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.onStop = typedArrayObtainStyledAttributes.getInt(index, this.onStop);
                                        break;
                                    case 73:
                                        this.onSkipToPrevious = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onSkipToPrevious);
                                        break;
                                    case 74:
                                        this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.onSkipToNext = typedArrayObtainStyledAttributes.getBoolean(index, this.onSkipToNext);
                                        break;
                                    case 76:
                                        this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getInt(index, this.PlaybackStateCompatCustomAction);
                                        break;
                                    case 77:
                                        this.write = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.write);
                                        break;
                                    case 78:
                                        this.AudioAttributesCompatParcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.AudioAttributesCompatParcelizer);
                                        break;
                                    case 79:
                                        this.onCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onCustomAction);
                                        break;
                                    case 80:
                                        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.IconCompatParcelizer);
                                        break;
                                    case 81:
                                        this.accessgetReportFullyDrawnExecutorp = typedArrayObtainStyledAttributes.getInt(index, this.accessgetReportFullyDrawnExecutorp);
                                        break;
                                    case 82:
                                        this.onPrepare = typedArrayObtainStyledAttributes.getInt(index, this.onPrepare);
                                        break;
                                    case 83:
                                        this.onSeekTo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onSeekTo);
                                        break;
                                    case 84:
                                        this.addObserverForBackInvoker = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.addObserverForBackInvoker);
                                        break;
                                    case 85:
                                        this.onRemoveQueueItemAt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.onRemoveQueueItemAt);
                                        break;
                                    case 86:
                                        this.createFullyDrawnExecutor = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.createFullyDrawnExecutor);
                                        break;
                                    case 87:
                                        this.RatingCompat = typedArrayObtainStyledAttributes.getBoolean(index, this.RatingCompat);
                                        break;
                                    case 88:
                                        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaMetadataCompat);
                                        break;
                                    case 89:
                                        this.onSkipToQueueItem = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.onPlayFromSearch = typedArrayObtainStyledAttributes.getBoolean(index, this.onPlayFromSearch);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        ensureViewModelStore.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        ensureViewModelStore.get(index);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class read {
        private static SparseIntArray RatingCompat;
        public boolean read = false;
        public float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        public float AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        public float AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.HUE_RED;
        public float MediaBrowserCompatItemReceiver = 1.0f;
        public float AudioAttributesImplApi26Parcelizer = 1.0f;
        public float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        public float MediaBrowserCompatMediaItem = Float.NaN;
        public int AudioAttributesImplBaseParcelizer = -1;
        public float MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
        public float MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
        public float MediaBrowserCompatSearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
        public boolean write = false;
        public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;

        public final void write(read readVar) {
            this.read = readVar.read;
            this.RemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = readVar.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatItemReceiver = readVar.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi26Parcelizer = readVar.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = readVar.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatMediaItem = readVar.MediaBrowserCompatMediaItem;
            this.AudioAttributesImplBaseParcelizer = readVar.AudioAttributesImplBaseParcelizer;
            this.MediaMetadataCompat = readVar.MediaMetadataCompat;
            this.MediaDescriptionCompat = readVar.MediaDescriptionCompat;
            this.MediaBrowserCompatSearchResultReceiver = readVar.MediaBrowserCompatSearchResultReceiver;
            this.write = readVar.write;
            this.IconCompatParcelizer = readVar.IconCompatParcelizer;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            RatingCompat = sparseIntArray;
            sparseIntArray.append(_isBlank.read.Transform_android_rotation, 1);
            RatingCompat.append(_isBlank.read.Transform_android_rotationX, 2);
            RatingCompat.append(_isBlank.read.Transform_android_rotationY, 3);
            RatingCompat.append(_isBlank.read.Transform_android_scaleX, 4);
            RatingCompat.append(_isBlank.read.Transform_android_scaleY, 5);
            RatingCompat.append(_isBlank.read.Transform_android_transformPivotX, 6);
            RatingCompat.append(_isBlank.read.Transform_android_transformPivotY, 7);
            RatingCompat.append(_isBlank.read.Transform_android_translationX, 8);
            RatingCompat.append(_isBlank.read.Transform_android_translationY, 9);
            RatingCompat.append(_isBlank.read.Transform_android_translationZ, 10);
            RatingCompat.append(_isBlank.read.Transform_android_elevation, 11);
            RatingCompat.append(_isBlank.read.Transform_transformPivotTarget, 12);
        }

        final void write(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.Transform);
            this.read = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (RatingCompat.get(index)) {
                    case 1:
                        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.RemoteActionCompatParcelizer);
                        break;
                    case 2:
                        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesCompatParcelizer);
                        break;
                    case 3:
                        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplApi21Parcelizer);
                        break;
                    case 4:
                        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatItemReceiver);
                        break;
                    case 5:
                        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 6:
                        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getDimension(index, this.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    case 7:
                        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimension(index, this.MediaBrowserCompatMediaItem);
                        break;
                    case 8:
                        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimension(index, this.MediaMetadataCompat);
                        break;
                    case 9:
                        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDimension(index, this.MediaDescriptionCompat);
                        break;
                    case 10:
                        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getDimension(index, this.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 11:
                        this.write = true;
                        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.IconCompatParcelizer);
                        break;
                    case 12:
                        this.AudioAttributesImplBaseParcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.AudioAttributesImplBaseParcelizer);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class AudioAttributesCompatParcelizer {
        public boolean write = false;
        public int read = 0;
        public int AudioAttributesCompatParcelizer = 0;
        public float IconCompatParcelizer = 1.0f;
        public float RemoteActionCompatParcelizer = Float.NaN;

        public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.write = audioAttributesCompatParcelizer.write;
            this.read = audioAttributesCompatParcelizer.read;
            this.IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        final void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.PropertySet);
            this.write = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.PropertySet_android_alpha) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.PropertySet_android_visibility) {
                    this.read = typedArrayObtainStyledAttributes.getInt(index, this.read);
                    this.read = ReferenceTypeDeserializer.read[this.read];
                } else if (index == _isBlank.read.PropertySet_visibilityMode) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.PropertySet_motionProgress) {
                    this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.RemoteActionCompatParcelizer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class RemoteActionCompatParcelizer {
        private static SparseIntArray MediaMetadataCompat;
        public boolean write = false;
        public int RemoteActionCompatParcelizer = -1;
        public int IconCompatParcelizer = 0;
        public String MediaDescriptionCompat = null;
        public int AudioAttributesImplApi26Parcelizer = -1;
        public int read = 0;
        public float AudioAttributesCompatParcelizer = Float.NaN;
        private int RatingCompat = -1;
        public float AudioAttributesImplApi21Parcelizer = Float.NaN;
        public float MediaBrowserCompatSearchResultReceiver = Float.NaN;
        public int MediaBrowserCompatMediaItem = -1;
        public String AudioAttributesImplBaseParcelizer = null;
        public int MediaBrowserCompatItemReceiver = -3;
        public int MediaBrowserCompatCustomActionResultReceiver = -1;

        public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.write = remoteActionCompatParcelizer.write;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            this.MediaDescriptionCompat = remoteActionCompatParcelizer.MediaDescriptionCompat;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            this.read = remoteActionCompatParcelizer.read;
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            this.RatingCompat = remoteActionCompatParcelizer.RatingCompat;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            MediaMetadataCompat = sparseIntArray;
            sparseIntArray.append(_isBlank.read.Motion_motionPathRotate, 1);
            MediaMetadataCompat.append(_isBlank.read.Motion_pathMotionArc, 2);
            MediaMetadataCompat.append(_isBlank.read.Motion_transitionEasing, 3);
            MediaMetadataCompat.append(_isBlank.read.Motion_drawPath, 4);
            MediaMetadataCompat.append(_isBlank.read.Motion_animateRelativeTo, 5);
            MediaMetadataCompat.append(_isBlank.read.Motion_animateCircleAngleTo, 6);
            MediaMetadataCompat.append(_isBlank.read.Motion_motionStagger, 7);
            MediaMetadataCompat.append(_isBlank.read.Motion_quantizeMotionSteps, 8);
            MediaMetadataCompat.append(_isBlank.read.Motion_quantizeMotionPhase, 9);
            MediaMetadataCompat.append(_isBlank.read.Motion_quantizeMotionInterpolator, 10);
        }

        final void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.Motion);
            this.write = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (MediaMetadataCompat.get(index)) {
                    case 1:
                        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplApi21Parcelizer);
                        break;
                    case 2:
                        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.MediaDescriptionCompat = EnumMapDeserializer.RemoteActionCompatParcelizer[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.read = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.RemoteActionCompatParcelizer = ReferenceTypeDeserializer.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, index, this.RemoteActionCompatParcelizer);
                        break;
                    case 6:
                        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInteger(index, this.IconCompatParcelizer);
                        break;
                    case 7:
                        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesCompatParcelizer);
                        break;
                    case 8:
                        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getInteger(index, this.MediaBrowserCompatMediaItem);
                        break;
                    case 9:
                        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 10:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.MediaBrowserCompatCustomActionResultReceiver = resourceId;
                            if (resourceId != -1) {
                                this.MediaBrowserCompatItemReceiver = -2;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.AudioAttributesImplBaseParcelizer = string;
                            if (string.indexOf("/") > 0) {
                                this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.MediaBrowserCompatItemReceiver = -2;
                            } else {
                                this.MediaBrowserCompatItemReceiver = -1;
                            }
                        } else {
                            this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getInteger(index, this.MediaBrowserCompatCustomActionResultReceiver);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class write {
        int AudioAttributesCompatParcelizer;
        read IconCompatParcelizer;
        String RemoteActionCompatParcelizer;
        public final AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer = new AudioAttributesCompatParcelizer();
        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer = new RemoteActionCompatParcelizer();
        public final IconCompatParcelizer write = new IconCompatParcelizer();
        public final read MediaBrowserCompatCustomActionResultReceiver = new read();
        public HashMap<String, StackTraceElementDeserializer> read = new HashMap<>();

        static class read {
            private int[] AudioAttributesImplApi26Parcelizer = new int[10];
            private int[] MediaBrowserCompatSearchResultReceiver = new int[10];
            private int write = 0;
            private int[] MediaBrowserCompatItemReceiver = new int[10];
            private float[] MediaBrowserCompatCustomActionResultReceiver = new float[10];
            private int IconCompatParcelizer = 0;
            private int[] AudioAttributesImplBaseParcelizer = new int[5];
            private String[] MediaDescriptionCompat = new String[5];
            private int read = 0;
            private int[] RemoteActionCompatParcelizer = new int[4];
            private boolean[] AudioAttributesImplApi21Parcelizer = new boolean[4];
            private int AudioAttributesCompatParcelizer = 0;

            read() {
            }

            final void RemoteActionCompatParcelizer(int i, int i2) {
                int i3 = this.write;
                int[] iArr = this.AudioAttributesImplApi26Parcelizer;
                if (i3 >= iArr.length) {
                    this.AudioAttributesImplApi26Parcelizer = Arrays.copyOf(iArr, iArr.length << 1);
                    int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
                    this.MediaBrowserCompatSearchResultReceiver = Arrays.copyOf(iArr2, iArr2.length << 1);
                }
                int[] iArr3 = this.AudioAttributesImplApi26Parcelizer;
                int i4 = this.write;
                iArr3[i4] = i;
                int[] iArr4 = this.MediaBrowserCompatSearchResultReceiver;
                this.write = i4 + 1;
                iArr4[i4] = i2;
            }

            final void write(int i, float f) {
                int i2 = this.IconCompatParcelizer;
                int[] iArr = this.MediaBrowserCompatItemReceiver;
                if (i2 >= iArr.length) {
                    this.MediaBrowserCompatItemReceiver = Arrays.copyOf(iArr, iArr.length << 1);
                    float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
                    this.MediaBrowserCompatCustomActionResultReceiver = Arrays.copyOf(fArr, fArr.length << 1);
                }
                int[] iArr2 = this.MediaBrowserCompatItemReceiver;
                int i3 = this.IconCompatParcelizer;
                iArr2[i3] = i;
                float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
                this.IconCompatParcelizer = i3 + 1;
                fArr2[i3] = f;
            }

            final void AudioAttributesCompatParcelizer(int i, String str) {
                int i2 = this.read;
                int[] iArr = this.AudioAttributesImplBaseParcelizer;
                if (i2 >= iArr.length) {
                    this.AudioAttributesImplBaseParcelizer = Arrays.copyOf(iArr, iArr.length << 1);
                    String[] strArr = this.MediaDescriptionCompat;
                    this.MediaDescriptionCompat = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                }
                int[] iArr2 = this.AudioAttributesImplBaseParcelizer;
                int i3 = this.read;
                iArr2[i3] = i;
                String[] strArr2 = this.MediaDescriptionCompat;
                this.read = i3 + 1;
                strArr2[i3] = str;
            }

            final void read(int i, boolean z) {
                int i2 = this.AudioAttributesCompatParcelizer;
                int[] iArr = this.RemoteActionCompatParcelizer;
                if (i2 >= iArr.length) {
                    this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, iArr.length << 1);
                    boolean[] zArr = this.AudioAttributesImplApi21Parcelizer;
                    this.AudioAttributesImplApi21Parcelizer = Arrays.copyOf(zArr, zArr.length << 1);
                }
                int[] iArr2 = this.RemoteActionCompatParcelizer;
                int i3 = this.AudioAttributesCompatParcelizer;
                iArr2[i3] = i;
                boolean[] zArr2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesCompatParcelizer = i3 + 1;
                zArr2[i3] = z;
            }

            final void RemoteActionCompatParcelizer(write writeVar) {
                for (int i = 0; i < this.write; i++) {
                    ReferenceTypeDeserializer.read(writeVar, this.AudioAttributesImplApi26Parcelizer[i], this.MediaBrowserCompatSearchResultReceiver[i]);
                }
                for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
                    ReferenceTypeDeserializer.IconCompatParcelizer(writeVar, this.MediaBrowserCompatItemReceiver[i2], this.MediaBrowserCompatCustomActionResultReceiver[i2]);
                }
                for (int i3 = 0; i3 < this.read; i3++) {
                    ReferenceTypeDeserializer.IconCompatParcelizer(writeVar, this.AudioAttributesImplBaseParcelizer[i3], this.MediaDescriptionCompat[i3]);
                }
                for (int i4 = 0; i4 < this.AudioAttributesCompatParcelizer; i4++) {
                    ReferenceTypeDeserializer.AudioAttributesCompatParcelizer(writeVar, this.RemoteActionCompatParcelizer[i4], this.AudioAttributesImplApi21Parcelizer[i4]);
                }
            }
        }

        public final void AudioAttributesCompatParcelizer(write writeVar) {
            read readVar = this.IconCompatParcelizer;
            if (readVar != null) {
                readVar.RemoteActionCompatParcelizer(writeVar);
            }
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final write clone() {
            write writeVar = new write();
            writeVar.write.read(this.write);
            writeVar.AudioAttributesImplBaseParcelizer.read(this.AudioAttributesImplBaseParcelizer);
            writeVar.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesImplApi26Parcelizer);
            writeVar.MediaBrowserCompatCustomActionResultReceiver.write(this.MediaBrowserCompatCustomActionResultReceiver);
            writeVar.AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            writeVar.IconCompatParcelizer = this.IconCompatParcelizer;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            IconCompatParcelizer(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                this.write.ParcelableVolumeInfo = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.write.onStop = barrier.IconCompatParcelizer();
                this.write.PlaybackStateCompat = barrier.AudioAttributesImplApi26Parcelizer();
                this.write.onSkipToPrevious = barrier.read();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(int i, Constraints.LayoutParams layoutParams) {
            write(i, layoutParams);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = layoutParams.addMenuProvider;
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer = layoutParams.addOnMultiWindowModeChangedListener;
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = layoutParams.addOnContextAvailableListener;
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer = layoutParams.addOnPictureInPictureModeChangedListener;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = layoutParams.addOnConfigurationChangedListener;
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = layoutParams.addOnNewIntentListener;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver = layoutParams.addOnUserLeaveHintListener;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem = layoutParams.getDefaultViewModelCreationExtras;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat = layoutParams.addOnTrimMemoryListener;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = layoutParams.getDefaultViewModelProviderFactory;
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver = layoutParams.getActivityResultRegistry;
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = layoutParams.menuHostHelperlambda0;
            this.MediaBrowserCompatCustomActionResultReceiver.write = layoutParams.addContentView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.AudioAttributesCompatParcelizer = i;
            this.write.onSetPlaybackSpeed = layoutParams.onSetRepeatMode;
            this.write.onSetShuffleMode = layoutParams.onSetPlaybackSpeed;
            this.write.ResultReceiver = layoutParams.accessensureViewModelStore;
            this.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = layoutParams.accessaddObserverForBackInvoker;
            this.write.accessensureViewModelStore = layoutParams.addObserverForBackInvokerlambda7;
            this.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = layoutParams._init_lambda4;
            this.write.AudioAttributesImplBaseParcelizer = layoutParams.AudioAttributesImplApi21Parcelizer;
            this.write.AudioAttributesImplApi26Parcelizer = layoutParams.read;
            this.write.RemoteActionCompatParcelizer = layoutParams.AudioAttributesCompatParcelizer;
            this.write.write = layoutParams.write;
            this.write.AudioAttributesCompatParcelizer = layoutParams.IconCompatParcelizer;
            this.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = layoutParams._init_lambda5;
            this.write._init_lambda3 = layoutParams.accessgetReportFullyDrawnExecutorp;
            this.write.onAddQueueItem = layoutParams.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = layoutParams.onAddQueueItem;
            this.write.onRewind = layoutParams.onRewind;
            this.write._init_lambda5 = layoutParams.ensureViewModelStore;
            this.write.MediaDescriptionCompat = layoutParams.MediaBrowserCompatMediaItem;
            this.write.MediaBrowserCompatItemReceiver = layoutParams.MediaBrowserCompatItemReceiver;
            this.write.AudioAttributesImplApi21Parcelizer = layoutParams.MediaBrowserCompatCustomActionResultReceiver;
            this.write.MediaBrowserCompatCustomActionResultReceiver = layoutParams.AudioAttributesImplBaseParcelizer;
            this.write.MediaBrowserCompatSearchResultReceiver = layoutParams.onCustomAction;
            this.write.MediaBrowserCompatMediaItem = layoutParams.onCommand;
            this.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = layoutParams.PlaybackStateCompat;
            this.write.onPrepareFromSearch = layoutParams.onPlayFromUri;
            this.write.onPlayFromUri = layoutParams.onPrepare;
            this.write.onPrepareFromMediaId = layoutParams.onPlayFromSearch;
            this.write.MediaSessionCompatResultReceiverWrapper = ((ViewGroup.LayoutParams) layoutParams).width;
            this.write.setSessionImpl = ((ViewGroup.LayoutParams) layoutParams).height;
            this.write.onSetCaptioningEnabled = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            this.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            this.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            this.write.read = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            this.write.IconCompatParcelizer = layoutParams.RemoteActionCompatParcelizer;
            this.write._init_lambda4 = layoutParams.accessonBackPresseds1027565324;
            this.write.onSetRating = layoutParams.onRemoveQueueItem;
            this.write.accessaddObserverForBackInvoker = layoutParams.addObserverForBackInvoker;
            this.write.onPrepareFromUri = layoutParams.onPrepareFromUri;
            this.write.RatingCompat = layoutParams.MediaMetadataCompat;
            this.write.MediaMetadataCompat = layoutParams.AudioAttributesImplApi26Parcelizer;
            this.write.accessgetReportFullyDrawnExecutorp = layoutParams.onSkipToNext;
            this.write.onPrepare = layoutParams.onStop;
            this.write.addObserverForBackInvoker = layoutParams.onSkipToPrevious;
            this.write.onSeekTo = layoutParams.setSessionImpl;
            this.write.createFullyDrawnExecutor = layoutParams.MediaSessionCompatResultReceiverWrapper;
            this.write.onRemoveQueueItemAt = layoutParams.onSkipToQueueItem;
            this.write.accessonBackPresseds1027565324 = layoutParams.ParcelableVolumeInfo;
            this.write.onRemoveQueueItem = layoutParams.MediaSessionCompatToken;
            this.write.onSkipToQueueItem = layoutParams.MediaDescriptionCompat;
            this.write.onPause = layoutParams.onPrepareFromSearch;
            this.write.handleMediaPlayPauseIfPendingOnHandler = layoutParams.onMediaButtonEvent;
            this.write.onMediaButtonEvent = layoutParams.onPause;
            this.write.onPlayFromMediaId = layoutParams.onPlay;
            this.write.onPlay = layoutParams.onPlayFromMediaId;
            this.write.onFastForward = layoutParams.onFastForward;
            this.write.onCustomAction = layoutParams.handleMediaPlayPauseIfPendingOnHandler;
            this.write.PlaybackStateCompatCustomAction = layoutParams.getSavedStateRegistryControllerannotations;
            this.write.onCommand = layoutParams.getMarginEnd();
            this.write._init_lambda2 = layoutParams.getMarginStart();
        }

        public final void IconCompatParcelizer(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.onSetRepeatMode = this.write.onSetPlaybackSpeed;
            layoutParams.onSetPlaybackSpeed = this.write.onSetShuffleMode;
            layoutParams.accessensureViewModelStore = this.write.ResultReceiver;
            layoutParams.accessaddObserverForBackInvoker = this.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            layoutParams.addObserverForBackInvokerlambda7 = this.write.accessensureViewModelStore;
            layoutParams._init_lambda4 = this.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            layoutParams.AudioAttributesImplApi21Parcelizer = this.write.AudioAttributesImplBaseParcelizer;
            layoutParams.read = this.write.AudioAttributesImplApi26Parcelizer;
            layoutParams.AudioAttributesCompatParcelizer = this.write.RemoteActionCompatParcelizer;
            layoutParams.write = this.write.write;
            layoutParams.IconCompatParcelizer = this.write.AudioAttributesCompatParcelizer;
            layoutParams._init_lambda5 = this.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            layoutParams.accessgetReportFullyDrawnExecutorp = this.write._init_lambda3;
            layoutParams.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.onAddQueueItem;
            layoutParams.onAddQueueItem = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.write.onSetCaptioningEnabled;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.write.read;
            layoutParams.onPlayFromMediaId = this.write.onPlay;
            layoutParams.onFastForward = this.write.onFastForward;
            layoutParams.onPrepareFromSearch = this.write.onPause;
            layoutParams.onMediaButtonEvent = this.write.handleMediaPlayPauseIfPendingOnHandler;
            layoutParams.onRewind = this.write.onRewind;
            layoutParams.ensureViewModelStore = this.write._init_lambda5;
            layoutParams.MediaBrowserCompatItemReceiver = this.write.MediaBrowserCompatItemReceiver;
            layoutParams.MediaBrowserCompatCustomActionResultReceiver = this.write.AudioAttributesImplApi21Parcelizer;
            layoutParams.AudioAttributesImplBaseParcelizer = this.write.MediaBrowserCompatCustomActionResultReceiver;
            layoutParams.MediaBrowserCompatMediaItem = this.write.MediaDescriptionCompat;
            layoutParams.onCustomAction = this.write.MediaBrowserCompatSearchResultReceiver;
            layoutParams.onCommand = this.write.MediaBrowserCompatMediaItem;
            layoutParams.accessonBackPresseds1027565324 = this.write._init_lambda4;
            layoutParams.onRemoveQueueItem = this.write.onSetRating;
            layoutParams.addObserverForBackInvoker = this.write.accessaddObserverForBackInvoker;
            layoutParams.onPrepareFromUri = this.write.onPrepareFromUri;
            layoutParams.MediaMetadataCompat = this.write.RatingCompat;
            layoutParams.AudioAttributesImplApi26Parcelizer = this.write.MediaMetadataCompat;
            layoutParams.onSkipToNext = this.write.accessgetReportFullyDrawnExecutorp;
            layoutParams.onStop = this.write.onPrepare;
            layoutParams.onSkipToPrevious = this.write.addObserverForBackInvoker;
            layoutParams.setSessionImpl = this.write.onSeekTo;
            layoutParams.MediaSessionCompatResultReceiverWrapper = this.write.createFullyDrawnExecutor;
            layoutParams.onSkipToQueueItem = this.write.onRemoveQueueItemAt;
            layoutParams.ParcelableVolumeInfo = this.write.accessonBackPresseds1027565324;
            layoutParams.MediaSessionCompatToken = this.write.onRemoveQueueItem;
            layoutParams.PlaybackStateCompat = this.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            layoutParams.onPlayFromUri = this.write.onPrepareFromSearch;
            layoutParams.onPrepare = this.write.onPlayFromUri;
            layoutParams.onPlayFromSearch = this.write.onPrepareFromMediaId;
            ((ViewGroup.LayoutParams) layoutParams).width = this.write.MediaSessionCompatResultReceiverWrapper;
            ((ViewGroup.LayoutParams) layoutParams).height = this.write.setSessionImpl;
            if (this.write.onSkipToQueueItem != null) {
                layoutParams.MediaDescriptionCompat = this.write.onSkipToQueueItem;
            }
            layoutParams.getSavedStateRegistryControllerannotations = this.write.PlaybackStateCompatCustomAction;
            layoutParams.setMarginStart(this.write._init_lambda2);
            layoutParams.setMarginEnd(this.write.onCommand);
            layoutParams.write();
        }
    }

    public final void RemoteActionCompatParcelizer(Context context, int i) {
        RemoteActionCompatParcelizer((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void write(ReferenceTypeDeserializer referenceTypeDeserializer) {
        this.AudioAttributesImplApi26Parcelizer.clear();
        for (Integer num : referenceTypeDeserializer.AudioAttributesImplApi26Parcelizer.keySet()) {
            write writeVar = referenceTypeDeserializer.AudioAttributesImplApi26Parcelizer.get(num);
            if (writeVar != null) {
                this.AudioAttributesImplApi26Parcelizer.put(num, writeVar.clone());
            }
        }
    }

    public final void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.AudioAttributesImplApi26Parcelizer.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.MediaBrowserCompatCustomActionResultReceiver && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(id), new write());
            }
            write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id));
            if (writeVar != null) {
                writeVar.read = StackTraceElementDeserializer.write(this.MediaBrowserCompatItemReceiver, childAt);
                writeVar.write(id, layoutParams);
                writeVar.AudioAttributesImplApi26Parcelizer.read = childAt.getVisibility();
                writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = childAt.getAlpha();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer = childAt.getRotation();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = childAt.getRotationX();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer = childAt.getRotationY();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = childAt.getScaleX();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver = pivotX;
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem = pivotY;
                }
                writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat = childAt.getTranslationX();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = childAt.getTranslationY();
                writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver = childAt.getTranslationZ();
                if (writeVar.MediaBrowserCompatCustomActionResultReceiver.write) {
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    writeVar.write.onSkipToNext = barrier.RemoteActionCompatParcelizer();
                    writeVar.write.PlaybackStateCompat = barrier.AudioAttributesImplApi26Parcelizer();
                    writeVar.write.onStop = barrier.IconCompatParcelizer();
                    writeVar.write.onSkipToPrevious = barrier.read();
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.AudioAttributesImplApi26Parcelizer.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.MediaBrowserCompatCustomActionResultReceiver && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(id), new write());
            }
            write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id));
            if (writeVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    writeVar.read((ConstraintHelper) childAt, id, layoutParams);
                }
                writeVar.IconCompatParcelizer(id, layoutParams);
            }
        }
    }

    public final void write(ConstraintLayout constraintLayout) {
        AudioAttributesCompatParcelizer(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        write writeVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                NumberDeserializersShortDeserializer.write(childAt);
            } else {
                if (this.MediaBrowserCompatCustomActionResultReceiver && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id)) && (writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id))) != null) {
                    StackTraceElementDeserializer.write(childAt, writeVar.read);
                }
            }
        }
    }

    public final void read(ConstraintHelper constraintHelper, JdkDeserializers jdkDeserializers, ConstraintLayout.LayoutParams layoutParams, SparseArray<JdkDeserializers> sparseArray) {
        write writeVar;
        int id = constraintHelper.getId();
        if (this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id)) && (writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id))) != null && (jdkDeserializers instanceof JsonNodeDeserializerArrayDeserializer)) {
            constraintHelper.read(writeVar, (JsonNodeDeserializerArrayDeserializer) jdkDeserializers, layoutParams, sparseArray);
        }
    }

    public final void write(int i, ConstraintLayout.LayoutParams layoutParams) {
        write writeVar;
        if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i)) || (writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i))) == null) {
            return;
        }
        writeVar.IconCompatParcelizer(layoutParams);
    }

    public final void AudioAttributesCompatParcelizer(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.AudioAttributesImplApi26Parcelizer.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                NumberDeserializersShortDeserializer.write(childAt);
            } else {
                if (this.MediaBrowserCompatCustomActionResultReceiver && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(id));
                    if (writeVar != null) {
                        if (childAt instanceof Barrier) {
                            writeVar.write.ParcelableVolumeInfo = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(writeVar.write.onStop);
                            barrier.setMargin(writeVar.write.onSkipToPrevious);
                            barrier.setAllowsGoneWidget(writeVar.write.onSkipToNext);
                            if (writeVar.write.PlaybackStateCompat != null) {
                                barrier.setReferencedIds(writeVar.write.PlaybackStateCompat);
                            } else if (writeVar.write.MediaSessionCompatToken != null) {
                                writeVar.write.PlaybackStateCompat = IconCompatParcelizer(barrier, writeVar.write.MediaSessionCompatToken);
                                barrier.setReferencedIds(writeVar.write.PlaybackStateCompat);
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.write();
                        writeVar.IconCompatParcelizer(layoutParams);
                        StackTraceElementDeserializer.write(childAt, writeVar.read);
                        childAt.setLayoutParams(layoutParams);
                        if (writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer == 0) {
                            childAt.setVisibility(writeVar.AudioAttributesImplApi26Parcelizer.read);
                        }
                        childAt.setAlpha(writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer);
                        childAt.setRotation(writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                        childAt.setRotationX(writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer);
                        childAt.setRotationY(writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer);
                        childAt.setScaleX(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver);
                        childAt.setScaleY(writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer);
                        if (writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer != -1) {
                            if (((View) childAt.getParent()).findViewById(writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer) != null) {
                                float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = childAt.getLeft();
                                    float top2 = childAt.getTop();
                                    childAt.setPivotX(left - left2);
                                    childAt.setPivotY(top - top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver)) {
                                childAt.setPivotX(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver);
                            }
                            if (!Float.isNaN(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem)) {
                                childAt.setPivotY(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem);
                            }
                        }
                        childAt.setTranslationX(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat);
                        childAt.setTranslationY(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat);
                        childAt.setTranslationZ(writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver);
                        if (writeVar.MediaBrowserCompatCustomActionResultReceiver.write) {
                            childAt.setElevation(writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            write writeVar2 = this.AudioAttributesImplApi26Parcelizer.get(num);
            if (writeVar2 != null) {
                if (writeVar2.write.ParcelableVolumeInfo == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    if (writeVar2.write.PlaybackStateCompat != null) {
                        barrier2.setReferencedIds(writeVar2.write.PlaybackStateCompat);
                    } else if (writeVar2.write.MediaSessionCompatToken != null) {
                        writeVar2.write.PlaybackStateCompat = IconCompatParcelizer(barrier2, writeVar2.write.MediaSessionCompatToken);
                        barrier2.setReferencedIds(writeVar2.write.PlaybackStateCompat);
                    }
                    barrier2.setType(writeVar2.write.onStop);
                    barrier2.setMargin(writeVar2.write.onSkipToPrevious);
                    ConstraintLayout.LayoutParams layoutParamsMediaDescriptionCompat = ConstraintLayout.MediaDescriptionCompat();
                    barrier2.MediaBrowserCompatCustomActionResultReceiver();
                    writeVar2.IconCompatParcelizer(layoutParamsMediaDescriptionCompat);
                    constraintLayout.addView(barrier2, layoutParamsMediaDescriptionCompat);
                }
                if (writeVar2.write.MediaSessionCompatQueueItem) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsMediaDescriptionCompat2 = ConstraintLayout.MediaDescriptionCompat();
                    writeVar2.IconCompatParcelizer(layoutParamsMediaDescriptionCompat2);
                    constraintLayout.addView(guideline, layoutParamsMediaDescriptionCompat2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).IconCompatParcelizer(constraintLayout);
            }
        }
    }

    public final void read(int i, int i2, int i3, int i4, int i5) {
        if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i))) {
            this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), new write());
        }
        write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
        if (writeVar == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    writeVar.write.onSetPlaybackSpeed = i3;
                    writeVar.write.onSetShuffleMode = -1;
                } else if (i4 == 2) {
                    writeVar.write.onSetShuffleMode = i3;
                    writeVar.write.onSetPlaybackSpeed = -1;
                } else {
                    StringBuilder sb = new StringBuilder("Left to ");
                    sb.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
                writeVar.write.onSetCaptioningEnabled = i5;
                return;
            case 2:
                if (i4 == 1) {
                    writeVar.write.ResultReceiver = i3;
                    writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1;
                } else {
                    if (i4 != 2) {
                        StringBuilder sb2 = new StringBuilder("right to ");
                        sb2.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i3;
                    writeVar.write.ResultReceiver = -1;
                }
                writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i5;
                return;
            case 3:
                if (i4 == 3) {
                    writeVar.write.accessensureViewModelStore = i3;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                } else {
                    if (i4 != 4) {
                        StringBuilder sb3 = new StringBuilder("right to ");
                        sb3.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3;
                    writeVar.write.accessensureViewModelStore = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                }
                writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = i5;
                return;
            case 4:
                if (i4 == 4) {
                    writeVar.write.AudioAttributesImplApi26Parcelizer = i3;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                } else {
                    if (i4 != 3) {
                        StringBuilder sb4 = new StringBuilder("right to ");
                        sb4.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    writeVar.write.AudioAttributesImplBaseParcelizer = i3;
                    writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                }
                writeVar.write.read = i5;
                return;
            case 5:
                if (i4 == 5) {
                    writeVar.write.RemoteActionCompatParcelizer = i3;
                    writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.accessensureViewModelStore = -1;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    return;
                }
                if (i4 == 3) {
                    writeVar.write.write = i3;
                    writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.accessensureViewModelStore = -1;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    return;
                }
                if (i4 != 4) {
                    StringBuilder sb5 = new StringBuilder("right to ");
                    sb5.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb5.append(" undefined");
                    throw new IllegalArgumentException(sb5.toString());
                }
                writeVar.write.AudioAttributesCompatParcelizer = i3;
                writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                writeVar.write.accessensureViewModelStore = -1;
                writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                return;
            case 6:
                if (i4 == 6) {
                    writeVar.write._init_lambda3 = i3;
                    writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
                } else {
                    if (i4 != 7) {
                        StringBuilder sb6 = new StringBuilder("right to ");
                        sb6.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i3;
                    writeVar.write._init_lambda3 = -1;
                }
                writeVar.write._init_lambda2 = i5;
                return;
            case 7:
                if (i4 == 7) {
                    writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
                    writeVar.write.onAddQueueItem = -1;
                } else {
                    if (i4 != 6) {
                        StringBuilder sb7 = new StringBuilder("right to ");
                        sb7.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    writeVar.write.onAddQueueItem = i3;
                    writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
                }
                writeVar.write.onCommand = i5;
                return;
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(AudioAttributesImplApi26Parcelizer(i2));
                sb8.append(" to ");
                sb8.append(AudioAttributesImplApi26Parcelizer(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4) {
        if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i))) {
            this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), new write());
        }
        write writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
        if (writeVar == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    writeVar.write.onSetPlaybackSpeed = i3;
                    writeVar.write.onSetShuffleMode = -1;
                    return;
                } else if (i4 == 2) {
                    writeVar.write.onSetShuffleMode = i3;
                    writeVar.write.onSetPlaybackSpeed = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("left to ");
                    sb.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    writeVar.write.ResultReceiver = i3;
                    writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1;
                    return;
                } else {
                    if (i4 != 2) {
                        StringBuilder sb2 = new StringBuilder("right to ");
                        sb2.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i3;
                    writeVar.write.ResultReceiver = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    writeVar.write.accessensureViewModelStore = i3;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                    return;
                }
                if (i4 != 4) {
                    StringBuilder sb3 = new StringBuilder("right to ");
                    sb3.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
                writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3;
                writeVar.write.accessensureViewModelStore = -1;
                writeVar.write.RemoteActionCompatParcelizer = -1;
                writeVar.write.write = -1;
                writeVar.write.AudioAttributesCompatParcelizer = -1;
                return;
            case 4:
                if (i4 == 4) {
                    writeVar.write.AudioAttributesImplApi26Parcelizer = i3;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.RemoteActionCompatParcelizer = -1;
                    writeVar.write.write = -1;
                    writeVar.write.AudioAttributesCompatParcelizer = -1;
                    return;
                }
                if (i4 != 3) {
                    StringBuilder sb4 = new StringBuilder("right to ");
                    sb4.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
                writeVar.write.AudioAttributesImplBaseParcelizer = i3;
                writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                writeVar.write.RemoteActionCompatParcelizer = -1;
                writeVar.write.write = -1;
                writeVar.write.AudioAttributesCompatParcelizer = -1;
                return;
            case 5:
                if (i4 == 5) {
                    writeVar.write.RemoteActionCompatParcelizer = i3;
                    writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.accessensureViewModelStore = -1;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    return;
                }
                if (i4 == 3) {
                    writeVar.write.write = i3;
                    writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                    writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                    writeVar.write.accessensureViewModelStore = -1;
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                    return;
                }
                if (i4 != 4) {
                    StringBuilder sb5 = new StringBuilder("right to ");
                    sb5.append(AudioAttributesImplApi26Parcelizer(i4));
                    sb5.append(" undefined");
                    throw new IllegalArgumentException(sb5.toString());
                }
                writeVar.write.AudioAttributesCompatParcelizer = i3;
                writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                writeVar.write.accessensureViewModelStore = -1;
                writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                return;
            case 6:
                if (i4 == 6) {
                    writeVar.write._init_lambda3 = i3;
                    writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
                    return;
                } else {
                    if (i4 != 7) {
                        StringBuilder sb6 = new StringBuilder("right to ");
                        sb6.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = i3;
                    writeVar.write._init_lambda3 = -1;
                    return;
                }
            case 7:
                if (i4 == 7) {
                    writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
                    writeVar.write.onAddQueueItem = -1;
                    return;
                } else {
                    if (i4 != 6) {
                        StringBuilder sb7 = new StringBuilder("right to ");
                        sb7.append(AudioAttributesImplApi26Parcelizer(i4));
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    writeVar.write.onAddQueueItem = i3;
                    writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
                    return;
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(AudioAttributesImplApi26Parcelizer(i2));
                sb8.append(" to ");
                sb8.append(AudioAttributesImplApi26Parcelizer(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public final void write(int i) {
        this.AudioAttributesImplApi26Parcelizer.remove(Integer.valueOf(i));
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        write writeVar;
        if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i)) || (writeVar = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                writeVar.write.onSetShuffleMode = -1;
                writeVar.write.onSetPlaybackSpeed = -1;
                writeVar.write.onSetCaptioningEnabled = -1;
                writeVar.write.onMediaButtonEvent = Integer.MIN_VALUE;
                return;
            case 2:
                writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = -1;
                writeVar.write.ResultReceiver = -1;
                writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = -1;
                writeVar.write.onPlayFromMediaId = Integer.MIN_VALUE;
                return;
            case 3:
                writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = -1;
                writeVar.write.accessensureViewModelStore = -1;
                writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = 0;
                writeVar.write.onPause = Integer.MIN_VALUE;
                return;
            case 4:
                writeVar.write.AudioAttributesImplBaseParcelizer = -1;
                writeVar.write.AudioAttributesImplApi26Parcelizer = -1;
                writeVar.write.read = 0;
                writeVar.write.handleMediaPlayPauseIfPendingOnHandler = Integer.MIN_VALUE;
                return;
            case 5:
                writeVar.write.RemoteActionCompatParcelizer = -1;
                writeVar.write.write = -1;
                writeVar.write.AudioAttributesCompatParcelizer = -1;
                writeVar.write.IconCompatParcelizer = 0;
                writeVar.write.onCustomAction = Integer.MIN_VALUE;
                return;
            case 6:
                writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = -1;
                writeVar.write._init_lambda3 = -1;
                writeVar.write._init_lambda2 = 0;
                writeVar.write.onPlay = Integer.MIN_VALUE;
                return;
            case 7:
                writeVar.write.onAddQueueItem = -1;
                writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
                writeVar.write.onCommand = 0;
                writeVar.write.onFastForward = Integer.MIN_VALUE;
                return;
            case 8:
                writeVar.write.MediaBrowserCompatCustomActionResultReceiver = -1.0f;
                writeVar.write.AudioAttributesImplApi21Parcelizer = -1;
                writeVar.write.MediaBrowserCompatItemReceiver = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final int AudioAttributesImplApi21Parcelizer(int i) {
        return AudioAttributesImplBaseParcelizer(i).AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
    }

    public final int read(int i) {
        return AudioAttributesImplBaseParcelizer(i).AudioAttributesImplApi26Parcelizer.read;
    }

    public final int AudioAttributesCompatParcelizer(int i) {
        return AudioAttributesImplBaseParcelizer(i).write.setSessionImpl;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return AudioAttributesImplBaseParcelizer(i).write.MediaSessionCompatResultReceiverWrapper;
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, float f) {
        write writeVarAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        writeVarAudioAttributesImplBaseParcelizer.write.MediaBrowserCompatItemReceiver = i2;
        writeVarAudioAttributesImplBaseParcelizer.write.AudioAttributesImplApi21Parcelizer = i3;
        writeVarAudioAttributesImplBaseParcelizer.write.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    public final void IconCompatParcelizer(int i, int i2) {
        AudioAttributesImplBaseParcelizer(i).write.onSeekTo = i2;
    }

    public final void write(int i, int i2) {
        AudioAttributesImplBaseParcelizer(i).write.onPlayFromUri = i2;
        AudioAttributesImplBaseParcelizer(i).write.onPrepareFromMediaId = -1;
        AudioAttributesImplBaseParcelizer(i).write.onPrepareFromSearch = -1.0f;
    }

    public final void MediaBrowserCompatItemReceiver(int i) {
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPrepareFromMediaId = i;
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPlayFromUri = -1;
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPrepareFromSearch = -1.0f;
    }

    public final void write() {
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPrepareFromSearch = 1.0f;
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPrepareFromMediaId = -1;
        AudioAttributesImplBaseParcelizer(R.id.gl_right).write.onPlayFromUri = -1;
    }

    private write AudioAttributesImplBaseParcelizer(int i) {
        if (!this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i))) {
            this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), new write());
        }
        return this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
    }

    private static String AudioAttributesImplApi26Parcelizer(int i) {
        switch (i) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    public final void read(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    write writeVarWrite = write(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        writeVarWrite.write.MediaSessionCompatQueueItem = true;
                    }
                    this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(writeVarWrite.AudioAttributesCompatParcelizer), writeVarWrite);
                } else {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c6, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ReferenceTypeDeserializer.RemoteActionCompatParcelizer(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int RemoteActionCompatParcelizer(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static write write(Context context, AttributeSet attributeSet, boolean z) {
        write writeVar = new write();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? _isBlank.read.ConstraintOverride : _isBlank.read.Constraint);
        write(writeVar, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return writeVar;
    }

    public static write write(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        write writeVar = new write();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, _isBlank.read.ConstraintOverride);
        write(writeVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return writeVar;
    }

    private static void write(write writeVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        write.read readVar = new write.read();
        writeVar.IconCompatParcelizer = readVar;
        writeVar.AudioAttributesImplBaseParcelizer.write = false;
        writeVar.write.onSetRepeatMode = false;
        writeVar.AudioAttributesImplApi26Parcelizer.write = false;
        writeVar.MediaBrowserCompatCustomActionResultReceiver.read = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (AudioAttributesImplApi21Parcelizer.get(index)) {
                case 2:
                    readVar.RemoteActionCompatParcelizer(2, typedArray.getDimensionPixelSize(index, writeVar.write.read));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    IconCompatParcelizer.get(index);
                    break;
                case 5:
                    readVar.AudioAttributesCompatParcelizer(5, typedArray.getString(index));
                    break;
                case 6:
                    readVar.RemoteActionCompatParcelizer(6, typedArray.getDimensionPixelOffset(index, writeVar.write.MediaBrowserCompatSearchResultReceiver));
                    break;
                case 7:
                    readVar.RemoteActionCompatParcelizer(7, typedArray.getDimensionPixelOffset(index, writeVar.write.MediaBrowserCompatMediaItem));
                    break;
                case 8:
                    readVar.RemoteActionCompatParcelizer(8, typedArray.getDimensionPixelSize(index, writeVar.write.onCommand));
                    break;
                case 11:
                    readVar.RemoteActionCompatParcelizer(11, typedArray.getDimensionPixelSize(index, writeVar.write.handleMediaPlayPauseIfPendingOnHandler));
                    break;
                case 12:
                    readVar.RemoteActionCompatParcelizer(12, typedArray.getDimensionPixelSize(index, writeVar.write.onFastForward));
                    break;
                case 13:
                    readVar.RemoteActionCompatParcelizer(13, typedArray.getDimensionPixelSize(index, writeVar.write.onMediaButtonEvent));
                    break;
                case 14:
                    readVar.RemoteActionCompatParcelizer(14, typedArray.getDimensionPixelSize(index, writeVar.write.onPlayFromMediaId));
                    break;
                case 15:
                    readVar.RemoteActionCompatParcelizer(15, typedArray.getDimensionPixelSize(index, writeVar.write.onPlay));
                    break;
                case 16:
                    readVar.RemoteActionCompatParcelizer(16, typedArray.getDimensionPixelSize(index, writeVar.write.onPause));
                    break;
                case 17:
                    readVar.RemoteActionCompatParcelizer(17, typedArray.getDimensionPixelOffset(index, writeVar.write.onPlayFromUri));
                    break;
                case 18:
                    readVar.RemoteActionCompatParcelizer(18, typedArray.getDimensionPixelOffset(index, writeVar.write.onPrepareFromMediaId));
                    break;
                case 19:
                    readVar.write(19, typedArray.getFloat(index, writeVar.write.onPrepareFromSearch));
                    break;
                case 20:
                    readVar.write(20, typedArray.getFloat(index, writeVar.write.onRewind));
                    break;
                case 21:
                    readVar.RemoteActionCompatParcelizer(21, typedArray.getLayoutDimension(index, writeVar.write.setSessionImpl));
                    break;
                case 22:
                    readVar.RemoteActionCompatParcelizer(22, read[typedArray.getInt(index, writeVar.AudioAttributesImplApi26Parcelizer.read)]);
                    break;
                case 23:
                    readVar.RemoteActionCompatParcelizer(23, typedArray.getLayoutDimension(index, writeVar.write.MediaSessionCompatResultReceiverWrapper));
                    break;
                case 24:
                    readVar.RemoteActionCompatParcelizer(24, typedArray.getDimensionPixelSize(index, writeVar.write.onSetCaptioningEnabled));
                    break;
                case 27:
                    readVar.RemoteActionCompatParcelizer(27, typedArray.getInt(index, writeVar.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                    break;
                case 28:
                    readVar.RemoteActionCompatParcelizer(28, typedArray.getDimensionPixelSize(index, writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4));
                    break;
                case 31:
                    readVar.RemoteActionCompatParcelizer(31, typedArray.getDimensionPixelSize(index, writeVar.write._init_lambda2));
                    break;
                case 34:
                    readVar.RemoteActionCompatParcelizer(34, typedArray.getDimensionPixelSize(index, writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0));
                    break;
                case 37:
                    readVar.write(37, typedArray.getFloat(index, writeVar.write._init_lambda5));
                    break;
                case 38:
                    writeVar.AudioAttributesCompatParcelizer = typedArray.getResourceId(index, writeVar.AudioAttributesCompatParcelizer);
                    readVar.RemoteActionCompatParcelizer(38, writeVar.AudioAttributesCompatParcelizer);
                    break;
                case 39:
                    readVar.write(39, typedArray.getFloat(index, writeVar.write.onSetRating));
                    break;
                case 40:
                    readVar.write(40, typedArray.getFloat(index, writeVar.write._init_lambda4));
                    break;
                case 41:
                    readVar.RemoteActionCompatParcelizer(41, typedArray.getInt(index, writeVar.write.onPrepareFromUri));
                    break;
                case 42:
                    readVar.RemoteActionCompatParcelizer(42, typedArray.getInt(index, writeVar.write.accessaddObserverForBackInvoker));
                    break;
                case 43:
                    readVar.write(43, typedArray.getFloat(index, writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer));
                    break;
                case 44:
                    readVar.read(44, true);
                    readVar.write(44, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer));
                    break;
                case 45:
                    readVar.write(45, typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer));
                    break;
                case 46:
                    readVar.write(46, typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer));
                    break;
                case 47:
                    readVar.write(47, typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver));
                    break;
                case 48:
                    readVar.write(48, typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer));
                    break;
                case 49:
                    readVar.write(49, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver));
                    break;
                case 50:
                    readVar.write(50, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem));
                    break;
                case 51:
                    readVar.write(51, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat));
                    break;
                case 52:
                    readVar.write(52, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat));
                    break;
                case 53:
                    readVar.write(53, typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver));
                    break;
                case 54:
                    readVar.RemoteActionCompatParcelizer(54, typedArray.getInt(index, writeVar.write.accessgetReportFullyDrawnExecutorp));
                    break;
                case 55:
                    readVar.RemoteActionCompatParcelizer(55, typedArray.getInt(index, writeVar.write.onPrepare));
                    break;
                case 56:
                    readVar.RemoteActionCompatParcelizer(56, typedArray.getDimensionPixelSize(index, writeVar.write.addObserverForBackInvoker));
                    break;
                case 57:
                    readVar.RemoteActionCompatParcelizer(57, typedArray.getDimensionPixelSize(index, writeVar.write.onSeekTo));
                    break;
                case 58:
                    readVar.RemoteActionCompatParcelizer(58, typedArray.getDimensionPixelSize(index, writeVar.write.createFullyDrawnExecutor));
                    break;
                case 59:
                    readVar.RemoteActionCompatParcelizer(59, typedArray.getDimensionPixelSize(index, writeVar.write.onRemoveQueueItemAt));
                    break;
                case 60:
                    readVar.write(60, typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer));
                    break;
                case 62:
                    readVar.RemoteActionCompatParcelizer(62, typedArray.getDimensionPixelSize(index, writeVar.write.AudioAttributesImplApi21Parcelizer));
                    break;
                case 63:
                    readVar.write(63, typedArray.getFloat(index, writeVar.write.MediaBrowserCompatCustomActionResultReceiver));
                    break;
                case 64:
                    readVar.RemoteActionCompatParcelizer(64, RemoteActionCompatParcelizer(typedArray, index, writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        readVar.AudioAttributesCompatParcelizer(65, typedArray.getString(index));
                    } else {
                        readVar.AudioAttributesCompatParcelizer(65, EnumMapDeserializer.RemoteActionCompatParcelizer[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    readVar.RemoteActionCompatParcelizer(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    readVar.write(67, typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer));
                    break;
                case 68:
                    readVar.write(68, typedArray.getFloat(index, writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer));
                    break;
                case 69:
                    readVar.write(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    readVar.write(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    readVar.RemoteActionCompatParcelizer(72, typedArray.getInt(index, writeVar.write.onStop));
                    break;
                case 73:
                    readVar.RemoteActionCompatParcelizer(73, typedArray.getDimensionPixelSize(index, writeVar.write.onSkipToPrevious));
                    break;
                case 74:
                    readVar.AudioAttributesCompatParcelizer(74, typedArray.getString(index));
                    break;
                case 75:
                    readVar.read(75, typedArray.getBoolean(index, writeVar.write.onSkipToNext));
                    break;
                case 76:
                    readVar.RemoteActionCompatParcelizer(76, typedArray.getInt(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer));
                    break;
                case 77:
                    readVar.AudioAttributesCompatParcelizer(77, typedArray.getString(index));
                    break;
                case 78:
                    readVar.RemoteActionCompatParcelizer(78, typedArray.getInt(index, writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer));
                    break;
                case 79:
                    readVar.write(79, typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer));
                    break;
                case 80:
                    readVar.read(80, typedArray.getBoolean(index, writeVar.write.RatingCompat));
                    break;
                case 81:
                    readVar.read(81, typedArray.getBoolean(index, writeVar.write.MediaMetadataCompat));
                    break;
                case 82:
                    readVar.RemoteActionCompatParcelizer(82, typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.IconCompatParcelizer));
                    break;
                case 83:
                    readVar.RemoteActionCompatParcelizer(83, RemoteActionCompatParcelizer(typedArray, index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer));
                    break;
                case 84:
                    readVar.RemoteActionCompatParcelizer(84, typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem));
                    break;
                case 85:
                    readVar.write(85, typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver));
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver = typedArray.getResourceId(index, -1);
                        readVar.RemoteActionCompatParcelizer(89, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver);
                        if (writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver != -1) {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -2;
                            readVar.RemoteActionCompatParcelizer(88, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer = typedArray.getString(index);
                        readVar.AudioAttributesCompatParcelizer(90, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer);
                        if (writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer.indexOf("/") > 0) {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver = typedArray.getResourceId(index, -1);
                            readVar.RemoteActionCompatParcelizer(89, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver);
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -2;
                            readVar.RemoteActionCompatParcelizer(88, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
                        } else {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -1;
                            readVar.RemoteActionCompatParcelizer(88, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
                        }
                    } else {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver);
                        readVar.RemoteActionCompatParcelizer(88, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    IconCompatParcelizer.get(index);
                    break;
                case 93:
                    readVar.RemoteActionCompatParcelizer(93, typedArray.getDimensionPixelSize(index, writeVar.write.IconCompatParcelizer));
                    break;
                case 94:
                    readVar.RemoteActionCompatParcelizer(94, typedArray.getDimensionPixelSize(index, writeVar.write.onCustomAction));
                    break;
                case 95:
                    IconCompatParcelizer(readVar, typedArray, index, 0);
                    break;
                case 96:
                    IconCompatParcelizer(readVar, typedArray, index, 1);
                    break;
                case 97:
                    readVar.RemoteActionCompatParcelizer(97, typedArray.getInt(index, writeVar.write.PlaybackStateCompatCustomAction));
                    break;
                case 98:
                    if (MotionLayout.RemoteActionCompatParcelizer) {
                        writeVar.AudioAttributesCompatParcelizer = typedArray.getResourceId(index, writeVar.AudioAttributesCompatParcelizer);
                        if (writeVar.AudioAttributesCompatParcelizer == -1) {
                            writeVar.RemoteActionCompatParcelizer = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        writeVar.RemoteActionCompatParcelizer = typedArray.getString(index);
                    } else {
                        writeVar.AudioAttributesCompatParcelizer = typedArray.getResourceId(index, writeVar.AudioAttributesCompatParcelizer);
                    }
                    break;
                case 99:
                    readVar.read(99, typedArray.getBoolean(index, writeVar.write.onPlayFromSearch));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(write writeVar, int i, float f) {
        if (i == 19) {
            writeVar.write.onPrepareFromSearch = f;
            return;
        }
        if (i == 20) {
            writeVar.write.onRewind = f;
            return;
        }
        if (i == 37) {
            writeVar.write._init_lambda5 = f;
            return;
        }
        if (i == 60) {
            writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer = f;
            return;
        }
        if (i == 63) {
            writeVar.write.MediaBrowserCompatCustomActionResultReceiver = f;
            return;
        }
        if (i == 79) {
            writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer = f;
            return;
        }
        if (i == 85) {
            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver = f;
            return;
        }
        if (i != 87) {
            if (i == 39) {
                writeVar.write.onSetRating = f;
                return;
            }
            if (i != 40) {
                switch (i) {
                    case 43:
                        writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = f;
                        break;
                    case 44:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = f;
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.write = true;
                        break;
                    case 45:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = f;
                        break;
                    case 46:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer = f;
                        break;
                    case 47:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = f;
                        break;
                    case 48:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = f;
                        break;
                    case 49:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver = f;
                        break;
                    case 50:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem = f;
                        break;
                    case 51:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat = f;
                        break;
                    case 52:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = f;
                        break;
                    case 53:
                        writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver = f;
                        break;
                    default:
                        switch (i) {
                            case 67:
                                writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer = f;
                                break;
                            case 68:
                                writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = f;
                                break;
                            case 69:
                                writeVar.write.accessonBackPresseds1027565324 = f;
                                break;
                            case 70:
                                writeVar.write.onRemoveQueueItem = f;
                                break;
                        }
                        break;
                }
                return;
            }
            writeVar.write._init_lambda4 = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(write writeVar, int i, int i2) {
        if (i == 6) {
            writeVar.write.MediaBrowserCompatSearchResultReceiver = i2;
            return;
        }
        if (i == 7) {
            writeVar.write.MediaBrowserCompatMediaItem = i2;
            return;
        }
        if (i == 8) {
            writeVar.write.onCommand = i2;
            return;
        }
        if (i == 27) {
            writeVar.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2;
            return;
        }
        if (i == 28) {
            writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i2;
            return;
        }
        if (i == 41) {
            writeVar.write.onPrepareFromUri = i2;
            return;
        }
        if (i == 42) {
            writeVar.write.accessaddObserverForBackInvoker = i2;
            return;
        }
        if (i == 61) {
            writeVar.write.MediaBrowserCompatItemReceiver = i2;
            return;
        }
        if (i == 62) {
            writeVar.write.AudioAttributesImplApi21Parcelizer = i2;
            return;
        }
        if (i == 72) {
            writeVar.write.onStop = i2;
            return;
        }
        if (i == 73) {
            writeVar.write.onSkipToPrevious = i2;
            return;
        }
        if (i == 2) {
            writeVar.write.read = i2;
            return;
        }
        if (i == 31) {
            writeVar.write._init_lambda2 = i2;
            return;
        }
        if (i == 34) {
            writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = i2;
            return;
        }
        if (i == 38) {
            writeVar.AudioAttributesCompatParcelizer = i2;
            return;
        }
        if (i == 64) {
            writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = i2;
            return;
        }
        if (i == 66) {
            writeVar.AudioAttributesImplBaseParcelizer.read = i2;
            return;
        }
        if (i == 76) {
            writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer = i2;
            return;
        }
        if (i == 78) {
            writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = i2;
            return;
        }
        if (i == 97) {
            writeVar.write.PlaybackStateCompatCustomAction = i2;
            return;
        }
        if (i == 93) {
            writeVar.write.IconCompatParcelizer = i2;
            return;
        }
        if (i != 94) {
            switch (i) {
                case 11:
                    writeVar.write.handleMediaPlayPauseIfPendingOnHandler = i2;
                    break;
                case 12:
                    writeVar.write.onFastForward = i2;
                    break;
                case 13:
                    writeVar.write.onMediaButtonEvent = i2;
                    break;
                case 14:
                    writeVar.write.onPlayFromMediaId = i2;
                    break;
                case 15:
                    writeVar.write.onPlay = i2;
                    break;
                case 16:
                    writeVar.write.onPause = i2;
                    break;
                case 17:
                    writeVar.write.onPlayFromUri = i2;
                    break;
                case 18:
                    writeVar.write.onPrepareFromMediaId = i2;
                    break;
                default:
                    switch (i) {
                        case 21:
                            writeVar.write.setSessionImpl = i2;
                            break;
                        case 22:
                            writeVar.AudioAttributesImplApi26Parcelizer.read = i2;
                            break;
                        case 23:
                            writeVar.write.MediaSessionCompatResultReceiverWrapper = i2;
                            break;
                        case 24:
                            writeVar.write.onSetCaptioningEnabled = i2;
                            break;
                        default:
                            switch (i) {
                                case 54:
                                    writeVar.write.accessgetReportFullyDrawnExecutorp = i2;
                                    break;
                                case 55:
                                    writeVar.write.onPrepare = i2;
                                    break;
                                case 56:
                                    writeVar.write.addObserverForBackInvoker = i2;
                                    break;
                                case 57:
                                    writeVar.write.onSeekTo = i2;
                                    break;
                                case 58:
                                    writeVar.write.createFullyDrawnExecutor = i2;
                                    break;
                                case 59:
                                    writeVar.write.onRemoveQueueItemAt = i2;
                                    break;
                                default:
                                    switch (i) {
                                        case 82:
                                            writeVar.AudioAttributesImplBaseParcelizer.IconCompatParcelizer = i2;
                                            break;
                                        case 83:
                                            writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer = i2;
                                            break;
                                        case 84:
                                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem = i2;
                                            break;
                                        default:
                                            if (i == 88) {
                                                writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = i2;
                                                break;
                                            } else if (i == 89) {
                                                writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver = i2;
                                                break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        writeVar.write.onCustomAction = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(write writeVar, int i, String str) {
        if (i == 5) {
            writeVar.write.MediaDescriptionCompat = str;
            return;
        }
        if (i == 65) {
            writeVar.AudioAttributesImplBaseParcelizer.MediaDescriptionCompat = str;
            return;
        }
        if (i == 74) {
            writeVar.write.MediaSessionCompatToken = str;
            writeVar.write.PlaybackStateCompat = null;
        } else if (i == 77) {
            writeVar.write.onSkipToQueueItem = str;
        } else {
            if (i == 87 || i != 90) {
                return;
            }
            writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AudioAttributesCompatParcelizer(write writeVar, int i, boolean z) {
        if (i == 44) {
            writeVar.MediaBrowserCompatCustomActionResultReceiver.write = z;
            return;
        }
        if (i == 75) {
            writeVar.write.onSkipToNext = z;
            return;
        }
        if (i != 87) {
            if (i == 80) {
                writeVar.write.RatingCompat = z;
            } else {
                if (i != 81) {
                    return;
                }
                writeVar.write.MediaMetadataCompat = z;
            }
        }
    }

    private static void write(write writeVar, TypedArray typedArray, boolean z) {
        if (z) {
            write(writeVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != _isBlank.read.Constraint_android_id && _isBlank.read.Constraint_android_layout_marginStart != index && _isBlank.read.Constraint_android_layout_marginEnd != index) {
                writeVar.AudioAttributesImplBaseParcelizer.write = true;
                writeVar.write.onSetRepeatMode = true;
                writeVar.AudioAttributesImplApi26Parcelizer.write = true;
                writeVar.MediaBrowserCompatCustomActionResultReceiver.read = true;
            }
            switch (IconCompatParcelizer.get(index)) {
                case 1:
                    writeVar.write.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.RemoteActionCompatParcelizer);
                    break;
                case 2:
                    writeVar.write.read = typedArray.getDimensionPixelSize(index, writeVar.write.read);
                    break;
                case 3:
                    writeVar.write.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.AudioAttributesImplApi26Parcelizer);
                    break;
                case 4:
                    writeVar.write.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.AudioAttributesImplBaseParcelizer);
                    break;
                case 5:
                    writeVar.write.MediaDescriptionCompat = typedArray.getString(index);
                    break;
                case 6:
                    writeVar.write.MediaBrowserCompatSearchResultReceiver = typedArray.getDimensionPixelOffset(index, writeVar.write.MediaBrowserCompatSearchResultReceiver);
                    break;
                case 7:
                    writeVar.write.MediaBrowserCompatMediaItem = typedArray.getDimensionPixelOffset(index, writeVar.write.MediaBrowserCompatMediaItem);
                    break;
                case 8:
                    writeVar.write.onCommand = typedArray.getDimensionPixelSize(index, writeVar.write.onCommand);
                    break;
                case 9:
                    writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    break;
                case 10:
                    writeVar.write.onAddQueueItem = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.onAddQueueItem);
                    break;
                case 11:
                    writeVar.write.handleMediaPlayPauseIfPendingOnHandler = typedArray.getDimensionPixelSize(index, writeVar.write.handleMediaPlayPauseIfPendingOnHandler);
                    break;
                case 12:
                    writeVar.write.onFastForward = typedArray.getDimensionPixelSize(index, writeVar.write.onFastForward);
                    break;
                case 13:
                    writeVar.write.onMediaButtonEvent = typedArray.getDimensionPixelSize(index, writeVar.write.onMediaButtonEvent);
                    break;
                case 14:
                    writeVar.write.onPlayFromMediaId = typedArray.getDimensionPixelSize(index, writeVar.write.onPlayFromMediaId);
                    break;
                case 15:
                    writeVar.write.onPlay = typedArray.getDimensionPixelSize(index, writeVar.write.onPlay);
                    break;
                case 16:
                    writeVar.write.onPause = typedArray.getDimensionPixelSize(index, writeVar.write.onPause);
                    break;
                case 17:
                    writeVar.write.onPlayFromUri = typedArray.getDimensionPixelOffset(index, writeVar.write.onPlayFromUri);
                    break;
                case 18:
                    writeVar.write.onPrepareFromMediaId = typedArray.getDimensionPixelOffset(index, writeVar.write.onPrepareFromMediaId);
                    break;
                case 19:
                    writeVar.write.onPrepareFromSearch = typedArray.getFloat(index, writeVar.write.onPrepareFromSearch);
                    break;
                case 20:
                    writeVar.write.onRewind = typedArray.getFloat(index, writeVar.write.onRewind);
                    break;
                case 21:
                    writeVar.write.setSessionImpl = typedArray.getLayoutDimension(index, writeVar.write.setSessionImpl);
                    break;
                case 22:
                    writeVar.AudioAttributesImplApi26Parcelizer.read = typedArray.getInt(index, writeVar.AudioAttributesImplApi26Parcelizer.read);
                    writeVar.AudioAttributesImplApi26Parcelizer.read = read[writeVar.AudioAttributesImplApi26Parcelizer.read];
                    break;
                case 23:
                    writeVar.write.MediaSessionCompatResultReceiverWrapper = typedArray.getLayoutDimension(index, writeVar.write.MediaSessionCompatResultReceiverWrapper);
                    break;
                case 24:
                    writeVar.write.onSetCaptioningEnabled = typedArray.getDimensionPixelSize(index, writeVar.write.onSetCaptioningEnabled);
                    break;
                case 25:
                    writeVar.write.onSetPlaybackSpeed = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.onSetPlaybackSpeed);
                    break;
                case 26:
                    writeVar.write.onSetShuffleMode = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.onSetShuffleMode);
                    break;
                case 27:
                    writeVar.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArray.getInt(index, writeVar.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    break;
                case 28:
                    writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = typedArray.getDimensionPixelSize(index, writeVar.write.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
                    break;
                case 29:
                    writeVar.write.ResultReceiver = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.ResultReceiver);
                    break;
                case 30:
                    writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
                    break;
                case 31:
                    writeVar.write._init_lambda2 = typedArray.getDimensionPixelSize(index, writeVar.write._init_lambda2);
                    break;
                case 32:
                    writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
                    break;
                case 33:
                    writeVar.write._init_lambda3 = RemoteActionCompatParcelizer(typedArray, index, writeVar.write._init_lambda3);
                    break;
                case 34:
                    writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = typedArray.getDimensionPixelSize(index, writeVar.write.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0);
                    break;
                case 35:
                    writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                    break;
                case 36:
                    writeVar.write.accessensureViewModelStore = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.accessensureViewModelStore);
                    break;
                case 37:
                    writeVar.write._init_lambda5 = typedArray.getFloat(index, writeVar.write._init_lambda5);
                    break;
                case 38:
                    writeVar.AudioAttributesCompatParcelizer = typedArray.getResourceId(index, writeVar.AudioAttributesCompatParcelizer);
                    break;
                case 39:
                    writeVar.write.onSetRating = typedArray.getFloat(index, writeVar.write.onSetRating);
                    break;
                case 40:
                    writeVar.write._init_lambda4 = typedArray.getFloat(index, writeVar.write._init_lambda4);
                    break;
                case 41:
                    writeVar.write.onPrepareFromUri = typedArray.getInt(index, writeVar.write.onPrepareFromUri);
                    break;
                case 42:
                    writeVar.write.accessaddObserverForBackInvoker = typedArray.getInt(index, writeVar.write.accessaddObserverForBackInvoker);
                    break;
                case 43:
                    writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = typedArray.getFloat(index, writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer);
                    break;
                case 44:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.write = true;
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
                    break;
                case 45:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer = typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer);
                    break;
                case 46:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer = typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer);
                    break;
                case 47:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver);
                    break;
                case 48:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer);
                    break;
                case 49:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver);
                    break;
                case 50:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem);
                    break;
                case 51:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat);
                    break;
                case 52:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat);
                    break;
                case 53:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver = typedArray.getDimension(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver);
                    break;
                case 54:
                    writeVar.write.accessgetReportFullyDrawnExecutorp = typedArray.getInt(index, writeVar.write.accessgetReportFullyDrawnExecutorp);
                    break;
                case 55:
                    writeVar.write.onPrepare = typedArray.getInt(index, writeVar.write.onPrepare);
                    break;
                case 56:
                    writeVar.write.addObserverForBackInvoker = typedArray.getDimensionPixelSize(index, writeVar.write.addObserverForBackInvoker);
                    break;
                case 57:
                    writeVar.write.onSeekTo = typedArray.getDimensionPixelSize(index, writeVar.write.onSeekTo);
                    break;
                case 58:
                    writeVar.write.createFullyDrawnExecutor = typedArray.getDimensionPixelSize(index, writeVar.write.createFullyDrawnExecutor);
                    break;
                case 59:
                    writeVar.write.onRemoveQueueItemAt = typedArray.getDimensionPixelSize(index, writeVar.write.onRemoveQueueItemAt);
                    break;
                case 60:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer = typedArray.getFloat(index, writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                    break;
                case 61:
                    writeVar.write.MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.MediaBrowserCompatItemReceiver);
                    break;
                case 62:
                    writeVar.write.AudioAttributesImplApi21Parcelizer = typedArray.getDimensionPixelSize(index, writeVar.write.AudioAttributesImplApi21Parcelizer);
                    break;
                case 63:
                    writeVar.write.MediaBrowserCompatCustomActionResultReceiver = typedArray.getFloat(index, writeVar.write.MediaBrowserCompatCustomActionResultReceiver);
                    break;
                case 64:
                    writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaDescriptionCompat = typedArray.getString(index);
                    } else {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaDescriptionCompat = EnumMapDeserializer.RemoteActionCompatParcelizer[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    writeVar.AudioAttributesImplBaseParcelizer.read = typedArray.getInt(index, 0);
                    break;
                case 67:
                    writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer = typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer);
                    break;
                case 68:
                    writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = typedArray.getFloat(index, writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer);
                    break;
                case 69:
                    writeVar.write.accessonBackPresseds1027565324 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    writeVar.write.onRemoveQueueItem = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    writeVar.write.onStop = typedArray.getInt(index, writeVar.write.onStop);
                    break;
                case 73:
                    writeVar.write.onSkipToPrevious = typedArray.getDimensionPixelSize(index, writeVar.write.onSkipToPrevious);
                    break;
                case 74:
                    writeVar.write.MediaSessionCompatToken = typedArray.getString(index);
                    break;
                case 75:
                    writeVar.write.onSkipToNext = typedArray.getBoolean(index, writeVar.write.onSkipToNext);
                    break;
                case 76:
                    writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer = typedArray.getInt(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer);
                    break;
                case 77:
                    writeVar.write.onSkipToQueueItem = typedArray.getString(index);
                    break;
                case 78:
                    writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = typedArray.getInt(index, writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer);
                    break;
                case 79:
                    writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer = typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer);
                    break;
                case 80:
                    writeVar.write.RatingCompat = typedArray.getBoolean(index, writeVar.write.RatingCompat);
                    break;
                case 81:
                    writeVar.write.MediaMetadataCompat = typedArray.getBoolean(index, writeVar.write.MediaMetadataCompat);
                    break;
                case 82:
                    writeVar.AudioAttributesImplBaseParcelizer.IconCompatParcelizer = typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.IconCompatParcelizer);
                    break;
                case 83:
                    writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer);
                    break;
                case 84:
                    writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem = typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem);
                    break;
                case 85:
                    writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver = typedArray.getFloat(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver);
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver = typedArray.getResourceId(index, -1);
                        if (writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver != -1) {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer = typedArray.getString(index);
                        if (writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer.indexOf("/") > 0) {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver = typedArray.getResourceId(index, -1);
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -2;
                        } else {
                            writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = -1;
                        }
                    } else {
                        writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver = typedArray.getInteger(index, writeVar.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    IconCompatParcelizer.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    IconCompatParcelizer.get(index);
                    break;
                case 91:
                    writeVar.write.write = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.write);
                    break;
                case 92:
                    writeVar.write.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(typedArray, index, writeVar.write.AudioAttributesCompatParcelizer);
                    break;
                case 93:
                    writeVar.write.IconCompatParcelizer = typedArray.getDimensionPixelSize(index, writeVar.write.IconCompatParcelizer);
                    break;
                case 94:
                    writeVar.write.onCustomAction = typedArray.getDimensionPixelSize(index, writeVar.write.onCustomAction);
                    break;
                case 95:
                    IconCompatParcelizer(writeVar.write, typedArray, index, 0);
                    break;
                case 96:
                    IconCompatParcelizer(writeVar.write, typedArray, index, 1);
                    break;
                case 97:
                    writeVar.write.PlaybackStateCompatCustomAction = typedArray.getInt(index, writeVar.write.PlaybackStateCompatCustomAction);
                    break;
            }
        }
        if (writeVar.write.MediaSessionCompatToken != null) {
            writeVar.write.PlaybackStateCompat = null;
        }
    }

    private static int[] IconCompatParcelizer(View view, String str) {
        int iIntValue;
        Object objWrite;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = _isBlank.write.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objWrite = ((ConstraintLayout) view.getParent()).write(strTrim)) != null && (objWrite instanceof Integer)) {
                iIntValue = ((Integer) objWrite).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public final write RemoteActionCompatParcelizer(int i) {
        if (this.AudioAttributesImplApi26Parcelizer.containsKey(Integer.valueOf(i))) {
            return this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
        }
        return null;
    }

    public final int[] AudioAttributesCompatParcelizer() {
        Integer[] numArr = (Integer[]) this.AudioAttributesImplApi26Parcelizer.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }
}
