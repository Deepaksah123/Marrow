###### Class androidx.compose.ui.viewinterop.AndroidViewHolder (androidx.compose.ui.viewinterop.AndroidViewHolder)
.class public Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/resetAsObject;
.implements Lo/_getByteArrayBuilder;
.implements Lo/createDummyDeserializationContext;
.implements Lo/finishBranchObject;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0010\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u001dB9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\u001a\u00a2\u0006\u0004\u0008!\u0010\u001cJ7\u0010#\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0014\u00a2\u0006\u0004\u0008*\u0010\u001cJ\u000f\u0010+\u001a\u00020\u001aH\u0014\u00a2\u0006\u0004\u0008+\u0010\u001cJ%\u0010/\u001a\u0004\u0018\u00010.2\u0008\u0010\u0007\u001a\u0004\u0018\u00010,2\u0008\u0010\t\u001a\u0004\u0018\u00010-H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u001f\u00101\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u00081\u00102J)\u00103\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010-2\u0006\u0010\u000b\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u00083\u00104J\r\u00105\u001a\u00020\u001a\u00a2\u0006\u0004\u00085\u0010\u001cJ\u0017\u00106\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u00086\u00107J\u0019\u00109\u001a\u00020\"2\u0008\u0010\u0007\u001a\u0004\u0018\u000108H\u0016\u00a2\u0006\u0004\u00089\u0010:J\'\u0010;\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008=\u0010>J/\u0010;\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008;\u0010?J\u000f\u0010@\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008@\u0010AJ/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010BJ\u001f\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010CJG\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010D\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010EJ?\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010FJ7\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010GJ/\u0010I\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020H2\u0006\u0010\r\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\'\u0010K\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020HH\u0016\u00a2\u0006\u0004\u0008K\u0010LJ\u000f\u0010M\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008M\u0010>J\u001f\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020NH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ\u0017\u0010;\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020NH\u0002\u00a2\u0006\u0004\u0008;\u0010QJ\u0017\u0010\u001e\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020RH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010SJ3\u0010\u001e\u001a\u00020T*\u00020T2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010UR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010VR\u0014\u0010\u001b\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0017\u0010;\u001a\u00020\u000e8\u0007\u00a2\u0006\u000c\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R6\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^8\u0007@EX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010b\"\u0004\u0008\u0015\u0010cR\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010dR0\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^8\u0006@EX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008e\u0010`\"\u0004\u0008\u001e\u0010cR0\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^8\u0006@EX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008f\u0010`\"\u0004\u0008\u001b\u0010cR*\u0010h\u001a\u00020g2\u0006\u0010\u0007\u001a\u00020g8\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR0\u0010o\u001a\u0010\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008o\u0010p\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR*\u0010v\u001a\u00020u2\u0006\u0010\u0007\u001a\u00020u8\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008v\u0010w\u001a\u0004\u0008x\u0010y\"\u0004\u0008z\u0010{R0\u0010|\u001a\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008|\u0010p\u001a\u0004\u0008}\u0010r\"\u0004\u0008~\u0010tR5\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u007f8\u0007@GX\u0087\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R7\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010\u0086\u00018\u0007@GX\u0087\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001\"\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0016\u0010[\u001a\u00020,8\u0002X\u0083\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u0019\u0010W\u001a\u00030\u008f\u00018\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0007\n\u0005\u0008!\u0010\u0092\u0001R/\u0010\u0096\u0001\u001a\u001a\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010nj\u0005\u0018\u0001`\u0095\u00018\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010pR\u0018\u0010\u0099\u0001\u001a\u00030\u0097\u00018CX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0096\u0001\u0010\u0098\u0001R\u001c\u0010\u009b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^8\u0002X\u0083\u0004\u00a2\u0006\u0007\n\u0005\u0008\u009a\u0001\u0010`R\u001b\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020\u001a0^8\u0002X\u0083\u0004\u00a2\u0006\u0007\n\u0005\u0008\u009c\u0001\u0010`R4\u0010\u009d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e\u00a2\u0006\u0015\n\u0005\u0008\u009d\u0001\u0010p\u001a\u0005\u0008\u009e\u0001\u0010r\"\u0005\u0008\u009f\u0001\u0010tR\u0016\u0010e\u001a\u00020,8\u0002X\u0083\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u008e\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0093\u0001\u0010VR\u0017\u0010\u009a\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010VR\u0018\u0010\u009c\u0001\u001a\u00030\u00a0\u00018\u0002X\u0083\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u00a1\u0001R\u0016\u0010f\u001a\u00020\"8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010dR\u0016\u0010\u0090\u0001\u001a\u00020\"8WX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a2\u0001\u0010>R\u001f\u0010\u00a6\u0001\u001a\u00030\u00a3\u00018\u0007X\u0087\u0004\u00a2\u0006\u000f\n\u0006\u0008\u0099\u0001\u0010\u00a4\u0001\u001a\u0005\u0008W\u0010\u00a5\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Landroid/view/ViewGroup;",
        "Lo/resetAsObject;",
        "Lo/_getByteArrayBuilder;",
        "Lo/createDummyDeserializationContext;",
        "Lo/finishBranchObject;",
        "Landroid/content/Context;",
        "p0",
        "Lo/convertNumberToLong;",
        "p1",
        "",
        "p2",
        "Lo/reportBadDefinition;",
        "p3",
        "Landroid/view/View;",
        "p4",
        "Lo/_configureGenerator;",
        "p5",
        "<init>",
        "(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V",
        "Lo/write;",
        "RemoteActionCompatParcelizer",
        "()Landroid/view/View;",
        "",
        "getAccessibilityClassName",
        "()Ljava/lang/CharSequence;",
        "",
        "read",
        "()V",
        "AudioAttributesCompatParcelizer",
        "write",
        "onMeasure",
        "(II)V",
        "AudioAttributesImplBaseParcelizer",
        "",
        "onLayout",
        "(ZIIII)V",
        "Landroid/view/ViewGroup$LayoutParams;",
        "getLayoutParams",
        "()Landroid/view/ViewGroup$LayoutParams;",
        "requestDisallowInterceptTouchEvent",
        "(Z)V",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "",
        "Landroid/graphics/Rect;",
        "Landroid/view/ViewParent;",
        "invalidateChildInParent",
        "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;",
        "onDescendantInvalidated",
        "(Landroid/view/View;Landroid/view/View;)V",
        "requestChildRectangleOnScreen",
        "(Landroid/view/View;Landroid/graphics/Rect;Z)Z",
        "MediaBrowserCompatCustomActionResultReceiver",
        "onWindowVisibilityChanged",
        "(I)V",
        "Landroid/graphics/Region;",
        "gatherTransparentRegion",
        "(Landroid/graphics/Region;)Z",
        "IconCompatParcelizer",
        "(III)I",
        "shouldDelayChildPressedState",
        "()Z",
        "(Landroid/view/View;Landroid/view/View;II)Z",
        "getNestedScrollAxes",
        "()I",
        "(Landroid/view/View;Landroid/view/View;II)V",
        "(Landroid/view/View;I)V",
        "p6",
        "(Landroid/view/View;IIIII[I)V",
        "(Landroid/view/View;IIIII)V",
        "(Landroid/view/View;II[II)V",
        "",
        "onNestedFling",
        "(Landroid/view/View;FFZ)Z",
        "onNestedPreFling",
        "(Landroid/view/View;FF)Z",
        "isNestedScrollingEnabled",
        "Landroidx/core/view/WindowInsetsCompat;",
        "onApplyWindowInsets",
        "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;",
        "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;",
        "Lo/NioPathSerializer$RemoteActionCompatParcelizer;",
        "(Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;",
        "Lo/_verifyEndArrayForSingle;",
        "(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;",
        "I",
        "AudioAttributesImplApi21Parcelizer",
        "Lo/reportBadDefinition;",
        "onFastForward",
        "Landroid/view/View;",
        "MediaBrowserCompatItemReceiver",
        "MediaMetadataCompat",
        "Lo/_configureGenerator;",
        "Lkotlin/Function0;",
        "onPlay",
        "Lo/getCreatedOnDateMs;",
        "AudioAttributesImplApi26Parcelizer",
        "()Lo/getCreatedOnDateMs;",
        "(Lo/getCreatedOnDateMs;)V",
        "Z",
        "onAddQueueItem",
        "handleMediaPlayPauseIfPendingOnHandler",
        "Lo/_handleOddName;",
        "modifier",
        "Lo/_handleOddName;",
        "getModifier",
        "()Lo/_handleOddName;",
        "setModifier",
        "(Lo/_handleOddName;)V",
        "Lkotlin/Function1;",
        "onModifierChanged",
        "Lo/getAnswerMap;",
        "getOnModifierChanged$ui",
        "()Lo/getAnswerMap;",
        "setOnModifierChanged$ui",
        "(Lo/getAnswerMap;)V",
        "Lo/bufferMapProperty;",
        "density",
        "Lo/bufferMapProperty;",
        "getDensity",
        "()Lo/bufferMapProperty;",
        "setDensity",
        "(Lo/bufferMapProperty;)V",
        "onDensityChanged",
        "getOnDensityChanged$ui",
        "setOnDensityChanged$ui",
        "Lo/hasGetter;",
        "lifecycleOwner",
        "Lo/hasGetter;",
        "getLifecycleOwner",
        "()Lo/hasGetter;",
        "setLifecycleOwner",
        "(Lo/hasGetter;)V",
        "Lo/PieChart;",
        "savedStateRegistryOwner",
        "Lo/PieChart;",
        "getSavedStateRegistryOwner",
        "()Lo/PieChart;",
        "setSavedStateRegistryOwner",
        "(Lo/PieChart;)V",
        "onCustomAction",
        "[I",
        "Lo/getKey;",
        "onMediaButtonEvent",
        "J",
        "Landroidx/core/view/WindowInsetsCompat;",
        "RatingCompat",
        "Lo/WritableTypeIdInclusion;",
        "Lo/BringIntoViewRequester;",
        "MediaBrowserCompatMediaItem",
        "Lo/PropertyMetadata;",
        "()Lo/PropertyMetadata;",
        "MediaBrowserCompatSearchResultReceiver",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "MediaDescriptionCompat",
        "onCommand",
        "onRequestDisallowInterceptTouchEvent",
        "getOnRequestDisallowInterceptTouchEvent$ui",
        "setOnRequestDisallowInterceptTouchEvent$ui",
        "Lo/rootArrayScope;",
        "Lo/rootArrayScope;",
        "onRemoveQueueItem",
        "Lo/_assertNotNull;",
        "Lo/_assertNotNull;",
        "()Lo/_assertNotNull;",
        "onPause"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;

.field private static final RemoteActionCompatParcelizer:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field public static final read:I


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:Landroidx/core/view/WindowInsetsCompat;

.field private IconCompatParcelizer:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Lo/WritableTypeIdInclusion;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:Z

.field private final MediaBrowserCompatMediaItem:[I

.field private final MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaDescriptionCompat:Lo/rootArrayScope;

.field private final MediaMetadataCompat:Lo/_configureGenerator;

.field private RatingCompat:I

.field private density:Lo/bufferMapProperty;

.field private handleMediaPlayPauseIfPendingOnHandler:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private lifecycleOwner:Lo/hasGetter;

.field private modifier:Lo/_handleOddName;

.field private onAddQueueItem:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final onCommand:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final onCustomAction:[I

.field private onDensityChanged:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Lo/bufferMapProperty;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private final onFastForward:Landroid/view/View;

.field private onMediaButtonEvent:J

.field private onModifierChanged:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Lo/_handleOddName;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private onPlay:Lo/getCreatedOnDateMs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private onRequestDisallowInterceptTouchEvent:Lo/getAnswerMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/getAnswerMap<",
            "-",
            "Ljava/lang/Boolean;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation
.end field

.field private savedStateRegistryOwner:Lo/PieChart;

.field private final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->read:I

    .line 701
    sget-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;

    check-cast v0, Lo/getAnswerMap;

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RemoteActionCompatParcelizer:Lo/getAnswerMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
    .registers 10

    .line 93
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 96
    iput p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->write:I

    .line 97
    iput-object p4, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    .line 98
    iput-object p5, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    .line 99
    iput-object p6, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaMetadataCompat:Lo/_configureGenerator;

    if-eqz p2, :cond_13

    .line 111
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lo/ConfigOverride;->read(Landroid/view/View;Lo/convertNumberToLong;)V

    :cond_13
    const/4 p1, 0x0

    .line 113
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setSaveFromParentEnabled(Z)V

    .line 115
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    move-object p2, p0

    check-cast p2, Landroid/view/View;

    .line 118
    new-instance p5, Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p5, Lo/NioPathSerializer$read;

    .line 116
    invoke-static {p2, p5}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/NioPathSerializer$read;)V

    .line 130
    move-object p5, p0

    check-cast p5, Lo/finishBranchObject;

    invoke-static {p2, p5}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Lo/finishBranchObject;)V

    .line 137
    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;->IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;

    check-cast p2, Lo/getCreatedOnDateMs;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onPlay:Lo/getCreatedOnDateMs;

    .line 146
    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;

    check-cast p2, Lo/getCreatedOnDateMs;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onAddQueueItem:Lo/getCreatedOnDateMs;

    .line 149
    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;

    check-cast p2, Lo/getCreatedOnDateMs;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->handleMediaPlayPauseIfPendingOnHandler:Lo/getCreatedOnDateMs;

    .line 153
    sget-object p2, Lo/_handleOddName;->AudioAttributesCompatParcelizer:Lo/_handleOddName$AudioAttributesCompatParcelizer;

    check-cast p2, Lo/_handleOddName;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Lo/_handleOddName;

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 p5, 0x0

    const/4 p6, 0x2

    const/4 v0, 0x0

    .line 164
    invoke-static {p2, p5, p6, v0}, Lo/bufferAnyProperty;->IconCompatParcelizer$default(FFILjava/lang/Object;)Lo/bufferMapProperty;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Lo/bufferMapProperty;

    .line 192
    new-array p2, p6, [I

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onCustomAction:[I

    .line 193
    sget-object p2, Lo/getKey;->AudioAttributesCompatParcelizer:Lo/getKey$AudioAttributesCompatParcelizer;

    invoke-virtual {p2}, Lo/getKey$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onMediaButtonEvent:J

    .line 209
    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;

    invoke-direct {p2, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p2, Lo/getCreatedOnDateMs;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/getCreatedOnDateMs;

    .line 219
    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;

    invoke-direct {p2, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p2, Lo/getCreatedOnDateMs;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onCommand:Lo/getCreatedOnDateMs;

    .line 223
    new-array p2, p6, [I

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem:[I

    const/high16 p2, -0x80000000

    .line 225
    iput p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RatingCompat:I

    .line 226
    iput p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi26Parcelizer:I

    .line 229
    new-instance p2, Lo/rootArrayScope;

    move-object p5, p0

    check-cast p5, Landroid/view/ViewGroup;

    invoke-direct {p2}, Lo/rootArrayScope;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaDescriptionCompat:Lo/rootArrayScope;

    .line 381
    move-object p2, p0

    check-cast p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 383
    new-instance p2, Lo/_assertNotNull;

    const/4 p5, 0x3

    invoke-direct {p2, p1, p1, p5, v0}, Lo/_assertNotNull;-><init>(ZIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 385
    invoke-virtual {p2, p0}, Lo/_assertNotNull;->write(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    .line 388
    sget-object p1, Lo/_handleOddName;->AudioAttributesCompatParcelizer:Lo/_handleOddName$AudioAttributesCompatParcelizer;

    check-cast p1, Lo/_handleOddName;

    invoke-static {}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer()Lo/AtomicReferenceDeserializer$AudioAttributesCompatParcelizer;

    move-result-object p5

    check-cast p5, Lo/DatabindException;

    invoke-static {p1, p5, p4}, Lo/objectIdResolverInstance;->AudioAttributesCompatParcelizer(Lo/_handleOddName;Lo/DatabindException;Lo/reportBadDefinition;)Lo/_handleOddName;

    move-result-object p1

    .line 389
    sget-object p4, Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;->read:Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;

    check-cast p4, Lo/getAnswerMap;

    const/4 p5, 0x1

    invoke-static {p1, p5, p4}, Lo/withValueInstantiators;->read(Lo/_handleOddName;ZLo/getAnswerMap;)Lo/_handleOddName;

    move-result-object p1

    .line 390
    invoke-static {p1, p0}, Lo/handleUnexpectedToken;->read(Lo/_handleOddName;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/_handleOddName;

    move-result-object p1

    .line 391
    new-instance p4, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;

    invoke-direct {p4, p0, p2, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p4, Lo/getAnswerMap;

    invoke-static {p1, p4}, Lo/WriterBasedJsonGenerator;->read(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;

    move-result-object p1

    .line 403
    new-instance p4, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;

    invoke-direct {p4, p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V

    check-cast p4, Lo/getAnswerMap;

    invoke-static {p1, p4}, Lo/getNullAccessPattern;->write(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;

    move-result-object p1

    .line 436
    new-instance p4, Lo/updateReference;

    new-instance p5, Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p5, Lo/getAnswerMap;

    invoke-direct {p4, p5}, Lo/updateReference;-><init>(Lo/getAnswerMap;)V

    check-cast p4, Lo/_handleOddName;

    invoke-interface {p1, p4}, Lo/_handleOddName;->AudioAttributesCompatParcelizer(Lo/_handleOddName;)Lo/_handleOddName;

    move-result-object p1

    .line 437
    invoke-virtual {p2, p3}, Lo/_assertNotNull;->RemoteActionCompatParcelizer(I)V

    .line 438
    iget-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Lo/_handleOddName;

    invoke-interface {p3, p1}, Lo/_handleOddName;->AudioAttributesCompatParcelizer(Lo/_handleOddName;)Lo/_handleOddName;

    move-result-object p3

    invoke-virtual {p2, p3}, Lo/_assertNotNull;->read(Lo/_handleOddName;)V

    .line 439
    new-instance p3, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;

    invoke-direct {p3, p2, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;-><init>(Lo/_assertNotNull;Lo/_handleOddName;)V

    check-cast p3, Lo/getAnswerMap;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lo/getAnswerMap;

    .line 441
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Lo/bufferMapProperty;

    invoke-virtual {p2, p1}, Lo/_assertNotNull;->AudioAttributesCompatParcelizer(Lo/bufferMapProperty;)V

    .line 442
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;

    invoke-direct {p1, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;-><init>(Lo/_assertNotNull;)V

    check-cast p1, Lo/getAnswerMap;

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lo/getAnswerMap;

    .line 444
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;

    invoke-direct {p1, p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V

    check-cast p1, Lo/getAnswerMap;

    invoke-virtual {p2, p1}, Lo/_assertNotNull;->RemoteActionCompatParcelizer(Lo/getAnswerMap;)V

    .line 448
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    check-cast p1, Lo/getAnswerMap;

    invoke-virtual {p2, p1}, Lo/_assertNotNull;->AudioAttributesCompatParcelizer(Lo/getAnswerMap;)V

    .line 458
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;

    invoke-direct {p1, p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V

    check-cast p1, Lo/withTypeHandler;

    .line 457
    invoke-virtual {p2, p1}, Lo/_assertNotNull;->AudioAttributesCompatParcelizer(Lo/withTypeHandler;)V

    .line 381
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 2

    .line 93
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;
    .registers 2

    .line 93
    invoke-direct {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->write(Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;J)V
    .registers 3

    .line 93
    iput-wide p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onMediaButtonEvent:J

    return-void
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 891
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I
    .registers 1

    .line 93
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onCustomAction:[I

    return-object p0
.end method

.method public static final synthetic AudioAttributesImplApi21Parcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)J
    .registers 3

    .line 93
    iget-wide v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onMediaButtonEvent:J

    return-wide v0
.end method

.method public static final synthetic AudioAttributesImplBaseParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/getCreatedOnDateMs;
    .registers 1

    .line 93
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/getCreatedOnDateMs;

    return-object p0
.end method

.method private final IconCompatParcelizer(III)I
    .registers 5

    const/high16 p0, 0x40000000    # 2.0f

    if-gez p3, :cond_25

    if-eq p1, p2, :cond_25

    const/4 p1, -0x2

    const v0, 0x7fffffff

    if-ne p3, p1, :cond_15

    if-eq p2, v0, :cond_15

    const/high16 p0, -0x80000000

    .line 542
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    :cond_15
    const/4 p1, -0x1

    if-ne p3, p1, :cond_1f

    if-eq p2, v0, :cond_1f

    .line 546
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    :cond_1f
    const/4 p0, 0x0

    .line 550
    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0

    .line 536
    :cond_25
    invoke-static {p3, p1, p2}, Lo/getQues;->write(III)I

    move-result p1

    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static final synthetic IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I
    .registers 4

    .line 93
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(III)I

    move-result p0

    return p0
.end method

.method private final IconCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 20

    move-object/from16 v0, p1

    .line 659
    invoke-virtual/range {p1 .. p1}, Landroidx/core/view/WindowInsetsCompat;->MediaMetadataCompat()Z

    move-result v1

    if-eqz v1, :cond_90

    move-object/from16 v1, p0

    .line 820
    iget-object v1, v1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

    invoke-virtual {v1}, Lo/_assertNotNull;->onPrepareFromUri()Lo/_bindAndClose;

    move-result-object v1

    .line 821
    invoke-virtual {v1}, Lo/_bindAndClose;->MediaBrowserCompatItemReceiver()Z

    move-result v2

    if-eqz v2, :cond_90

    .line 824
    move-object v2, v1

    check-cast v2, Lo/isAbstract;

    invoke-static {v2}, Lo/hasRawClass;->AudioAttributesCompatParcelizer(Lo/isAbstract;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/referringProperties;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v3

    .line 825
    invoke-static {v3, v4}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v5

    const/4 v6, 0x0

    if-gez v5, :cond_29

    move v5, v6

    .line 827
    :cond_29
    invoke-static {v3, v4}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result v3

    if-gez v3, :cond_30

    move v3, v6

    .line 828
    :cond_30
    invoke-static {v2}, Lo/hasRawClass;->RemoteActionCompatParcelizer(Lo/isAbstract;)Lo/isAbstract;

    move-result-object v2

    invoke-interface {v2}, Lo/isAbstract;->write()J

    move-result-wide v7

    const/16 v2, 0x20

    shr-long v9, v7, v2

    long-to-int v4, v9

    long-to-int v7, v7

    .line 835
    invoke-virtual {v1}, Lo/_bindAndClose;->write()J

    move-result-wide v8

    shr-long v10, v8, v2

    long-to-int v10, v10

    long-to-int v8, v8

    int-to-float v9, v10

    int-to-float v8, v8

    .line 848
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    .line 849
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v11, v8

    int-to-long v13, v6

    shl-long/2addr v13, v2

    const/4 v8, -0x1

    move v15, v7

    int-to-long v6, v8

    const/16 v8, 0x3f

    shr-long v16, v6, v8

    shl-long v16, v16, v2

    sub-long v6, v6, v16

    or-long/2addr v6, v13

    and-long/2addr v6, v11

    shl-long v8, v9, v2

    or-long/2addr v6, v8

    .line 847
    invoke-static {v6, v7}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v6

    .line 846
    invoke-virtual {v1, v6, v7}, Lo/_bindAndClose;->IconCompatParcelizer(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/referringProperties;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v1

    .line 851
    invoke-static {v1, v2}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v6

    sub-int/2addr v4, v6

    if-gez v4, :cond_78

    const/4 v4, 0x0

    .line 852
    :cond_78
    invoke-static {v1, v2}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result v1

    sub-int v7, v15, v1

    if-ltz v7, :cond_82

    move v6, v7

    goto :goto_83

    :cond_82
    const/4 v6, 0x0

    :goto_83
    if-nez v5, :cond_8c

    if-nez v3, :cond_8c

    if-nez v4, :cond_8c

    if-nez v6, :cond_8c

    goto :goto_90

    .line 662
    :cond_8c
    invoke-virtual {v0, v5, v3, v4, v6}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    :cond_90
    :goto_90
    return-object v0
.end method

.method public static final synthetic IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/_configureGenerator;
    .registers 1

    .line 93
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaMetadataCompat:Lo/_configureGenerator;

    return-object p0
.end method

.method public static final synthetic IconCompatParcelizer()Lo/getAnswerMap;
    .registers 1

    .line 93
    sget-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RemoteActionCompatParcelizer:Lo/getAnswerMap;

    return-object v0
.end method

.method public static final synthetic IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Z)V
    .registers 2

    .line 93
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method

.method private static final IconCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 343
    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic MediaBrowserCompatCustomActionResultReceiver(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/PropertyMetadata;
    .registers 1

    .line 93
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem()Lo/PropertyMetadata;

    move-result-object p0

    return-object p0
.end method

.method private final MediaBrowserCompatMediaItem()Lo/PropertyMetadata;
    .registers 2

    .line 203
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_b

    .line 785
    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    invoke-static {v0}, Lo/reportWrongTokenException;->read(Ljava/lang/String;)V

    .line 206
    :cond_b
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaMetadataCompat:Lo/_configureGenerator;

    invoke-interface {p0}, Lo/_configureGenerator;->onPrepare()Lo/PropertyMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 93
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplBaseParcelizer:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method public static final synthetic read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/reportBadDefinition;
    .registers 1

    .line 93
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    return-object p0
.end method

.method public static final synthetic read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/getAnswerMap;)V
    .registers 2

    .line 93
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer:Lo/getAnswerMap;

    return-void
.end method

.method private final write(Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;
    .registers 20

    move-object/from16 v6, p0

    .line 858
    iget-object v0, v6, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

    invoke-virtual {v0}, Lo/_assertNotNull;->onPrepareFromUri()Lo/_bindAndClose;

    move-result-object v0

    .line 859
    invoke-virtual {v0}, Lo/_bindAndClose;->MediaBrowserCompatItemReceiver()Z

    move-result v1

    if-eqz v1, :cond_a4

    .line 862
    move-object v1, v0

    check-cast v1, Lo/isAbstract;

    invoke-static {v1}, Lo/hasRawClass;->AudioAttributesCompatParcelizer(Lo/isAbstract;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/referringProperties;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v2

    .line 863
    invoke-static {v2, v3}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v4

    const/4 v5, 0x0

    if-gez v4, :cond_22

    move v7, v5

    goto :goto_23

    :cond_22
    move v7, v4

    .line 865
    :goto_23
    invoke-static {v2, v3}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result v2

    if-gez v2, :cond_2b

    move v8, v5

    goto :goto_2c

    :cond_2b
    move v8, v2

    .line 866
    :goto_2c
    invoke-static {v1}, Lo/hasRawClass;->RemoteActionCompatParcelizer(Lo/isAbstract;)Lo/isAbstract;

    move-result-object v1

    invoke-interface {v1}, Lo/isAbstract;->write()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v9, v1, v3

    long-to-int v4, v9

    long-to-int v1, v1

    .line 873
    invoke-virtual {v0}, Lo/_bindAndClose;->write()J

    move-result-wide v9

    shr-long v11, v9, v3

    long-to-int v2, v11

    long-to-int v9, v9

    int-to-float v2, v2

    int-to-float v9, v9

    .line 886
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    .line 887
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v12, v2

    int-to-long v14, v5

    shl-long/2addr v14, v3

    const/4 v2, -0x1

    int-to-long v5, v2

    const/16 v2, 0x3f

    shr-long v16, v5, v2

    shl-long v16, v16, v3

    sub-long v5, v5, v16

    or-long/2addr v5, v14

    and-long/2addr v5, v12

    shl-long v2, v10, v3

    or-long/2addr v2, v5

    .line 885
    invoke-static {v2, v3}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v2

    .line 884
    invoke-virtual {v0, v2, v3}, Lo/_bindAndClose;->IconCompatParcelizer(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/referringProperties;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v2

    .line 889
    invoke-static {v2, v3}, Lo/hasReferringProperties;->IconCompatParcelizer(J)I

    move-result v0

    sub-int/2addr v4, v0

    if-gez v4, :cond_74

    const/4 v6, 0x0

    goto :goto_75

    :cond_74
    move v6, v4

    .line 890
    :goto_75
    invoke-static {v2, v3}, Lo/hasReferringProperties;->AudioAttributesCompatParcelizer(J)I

    move-result v0

    sub-int/2addr v1, v0

    if-ltz v1, :cond_7e

    move v9, v1

    goto :goto_7f

    :cond_7e
    const/4 v9, 0x0

    :goto_7f
    if-nez v7, :cond_88

    if-nez v8, :cond_88

    if-nez v6, :cond_88

    if-nez v9, :cond_88

    goto :goto_a4

    .line 667
    :cond_88
    new-instance v10, Lo/NioPathSerializer$RemoteActionCompatParcelizer;

    invoke-virtual/range {p1 .. p1}, Lo/NioPathSerializer$RemoteActionCompatParcelizer;->IconCompatParcelizer()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    move-object/from16 v0, p0

    move v2, v7

    move v3, v8

    move v4, v6

    move v5, v9

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->write(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lo/NioPathSerializer$RemoteActionCompatParcelizer;->write()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->write(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v0

    invoke-direct {v10, v11, v0}, Lo/NioPathSerializer$RemoteActionCompatParcelizer;-><init>(Lo/_verifyEndArrayForSingle;Lo/_verifyEndArrayForSingle;)V

    return-object v10

    :cond_a4
    :goto_a4
    return-object p1
.end method

.method private final write(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;
    .registers 7

    .line 693
    iget p0, p1, Lo/_verifyEndArrayForSingle;->read:I

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    if-gez p0, :cond_7

    move p0, p2

    .line 694
    :cond_7
    iget v0, p1, Lo/_verifyEndArrayForSingle;->write:I

    sub-int/2addr v0, p3

    if-gez v0, :cond_d

    move v0, p2

    .line 695
    :cond_d
    iget p3, p1, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    sub-int/2addr p3, p4

    if-gez p3, :cond_13

    move p3, p2

    .line 696
    :cond_13
    iget p1, p1, Lo/_verifyEndArrayForSingle;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p1, p5

    if-gez p1, :cond_19

    goto :goto_1a

    :cond_19
    move p2, p1

    .line 692
    :goto_1a
    invoke-static {p0, v0, p3, p2}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Z
    .registers 1

    .line 93
    iget-boolean p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver:Z

    return p0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()V
    .registers 2

    .line 252
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onAddQueueItem:Lo/getCreatedOnDateMs;

    invoke-interface {v0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    .line 253
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V
    .registers 24

    .line 604
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    move-object/from16 v0, p0

    .line 605
    iget-object v0, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    .line 606
    invoke-static/range {p2 .. p2}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v1

    invoke-static/range {p3 .. p3}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v2

    .line 803
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    .line 804
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/4 v5, 0x0

    int-to-long v6, v5

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    const/4 v9, -0x1

    int-to-long v10, v9

    const/16 v12, 0x3f

    shr-long v13, v10, v12

    shl-long/2addr v13, v8

    sub-long/2addr v10, v13

    or-long/2addr v6, v10

    and-long/2addr v1, v6

    shl-long/2addr v3, v8

    or-long/2addr v1, v3

    .line 802
    invoke-static {v1, v2}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v1

    .line 607
    invoke-static/range {p4 .. p4}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v3

    invoke-static/range {p5 .. p5}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v4

    .line 807
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    .line 808
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    int-to-long v10, v5

    shl-long/2addr v10, v8

    int-to-long v13, v9

    shr-long v15, v13, v12

    shl-long/2addr v15, v8

    sub-long/2addr v13, v15

    or-long v9, v10, v13

    and-long/2addr v3, v9

    shl-long v5, v6, v8

    or-long/2addr v3, v5

    .line 806
    invoke-static {v3, v4}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v3

    .line 608
    invoke-static/range {p6 .. p6}, Lo/AtomicReferenceDeserializer;->write(I)I

    move-result v5

    move-object/from16 p0, v0

    move-wide/from16 p1, v1

    move-wide/from16 p3, v3

    move/from16 p5, v5

    .line 605
    invoke-virtual/range {p0 .. p5}, Lo/reportBadDefinition;->read(JJI)J

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Lo/_assertNotNull;
    .registers 1

    .line 381
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Lo/getCreatedOnDateMs;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 137
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onPlay:Lo/getCreatedOnDateMs;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()V
    .registers 4

    .line 280
    iget v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RatingCompat:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_d

    iget v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi26Parcelizer:I

    if-eq v2, v1, :cond_d

    .line 285
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    :cond_d
    return-void
.end method

.method public IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    and-int/lit8 p0, p3, 0x2

    const/4 p1, 0x1

    if-nez p0, :cond_b

    and-int/lit8 p0, p3, 0x1

    if-nez p0, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    return p1
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 3

    .line 340
    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_11

    .line 343
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    new-instance v1, Lo/referenceValue;

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onCommand:Lo/getCreatedOnDateMs;

    invoke-direct {v1, p0}, Lo/referenceValue;-><init>(Lo/getCreatedOnDateMs;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 347
    :cond_11
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatSearchResultReceiver:Lo/_assertNotNull;

    invoke-virtual {p0}, Lo/_assertNotNull;->ensureViewModelStore()V

    return-void
.end method

.method public final MediaBrowserCompatItemReceiver()Landroid/view/View;
    .registers 1

    .line 98
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Landroid/view/View;
    .registers 1

    .line 134
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 3

    .line 573
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaDescriptionCompat:Lo/rootArrayScope;

    invoke-virtual {p0, p2}, Lo/rootArrayScope;->read(I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
    .registers 15

    .line 613
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_7

    return-void

    .line 615
    :cond_7
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    .line 616
    invoke-static {p2}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result p1

    invoke-static {p3}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result p2

    .line 811
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    .line 812
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/4 p3, 0x0

    int-to-long v2, p3

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const/4 v5, -0x1

    int-to-long v5, v5

    const/16 v7, 0x3f

    shr-long v7, v5, v7

    shl-long/2addr v7, v4

    sub-long/2addr v5, v7

    or-long/2addr v2, v5

    and-long/2addr p1, v2

    shl-long/2addr v0, v4

    or-long/2addr p1, v0

    .line 810
    invoke-static {p1, p2}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide p1

    .line 617
    invoke-static {p5}, Lo/AtomicReferenceDeserializer;->write(I)I

    move-result p5

    .line 615
    invoke-virtual {p0, p1, p2, p5}, Lo/reportBadDefinition;->AudioAttributesCompatParcelizer(JI)J

    move-result-wide p0

    shr-long v0, p0, v4

    long-to-int p2, v0

    .line 816
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    .line 619
    invoke-static {p2}, Lo/JsonPOJOBuilder;->AudioAttributesCompatParcelizer(F)I

    move-result p2

    aput p2, p4, p3

    long-to-int p0, p0

    .line 819
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    const/4 p1, 0x1

    .line 620
    invoke-static {p0}, Lo/JsonPOJOBuilder;->AudioAttributesCompatParcelizer(F)I

    move-result p0

    aput p0, p4, p1

    return-void
.end method

.method protected final RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 139
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onPlay:Lo/getCreatedOnDateMs;

    const/4 p1, 0x1

    .line 140
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver:Z

    .line 141
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/getCreatedOnDateMs;

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .registers 11

    const/4 v0, 0x1

    if-nez p1, :cond_4

    return v0

    .line 366
    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem:[I

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 368
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem:[I

    const/4 v2, 0x0

    aget v4, v1, v2

    .line 369
    aget v5, v1, v0

    .line 370
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 371
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem:[I

    aget v2, v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    .line 372
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    add-int v6, v4, v1

    add-int v7, v2, p0

    move-object v3, p1

    .line 367
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 1

    .line 237
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final getDensity()Lo/bufferMapProperty;
    .registers 1

    .line 164
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Lo/bufferMapProperty;

    return-object p0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 293
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    if-nez p0, :cond_e

    .line 294
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_e
    return-object p0
.end method

.method public final getLifecycleOwner()Lo/hasGetter;
    .registers 1

    .line 175
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Lo/hasGetter;

    return-object p0
.end method

.method public final getModifier()Lo/_handleOddName;
    .registers 1

    .line 153
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Lo/_handleOddName;

    return-object p0
.end method

.method public getNestedScrollAxes()I
    .registers 1

    .line 565
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaDescriptionCompat:Lo/rootArrayScope;

    invoke-virtual {p0}, Lo/rootArrayScope;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public final getOnDensityChanged$ui()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "Lo/bufferMapProperty;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 172
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lo/getAnswerMap;

    return-object p0
.end method

.method public final getOnModifierChanged$ui()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "Lo/_handleOddName;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 161
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lo/getAnswerMap;

    return-object p0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui()Lo/getAnswerMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/getAnswerMap<",
            "Ljava/lang/Boolean;",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 221
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lo/getAnswerMap;

    return-object p0
.end method

.method public final getSavedStateRegistryOwner()Lo/PieChart;
    .registers 1

    .line 184
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Lo/PieChart;

    return-object p0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .registers 3

    .line 318
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 319
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatCustomActionResultReceiver()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public isNestedScrollingEnabled()Z
    .registers 1

    .line 649
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result p0

    return p0
.end method

.method public onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 3

    .line 654
    new-instance p1, Landroidx/core/view/WindowInsetsCompat;

    invoke-direct {p1, p2}, Landroidx/core/view/WindowInsetsCompat;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplBaseParcelizer:Landroidx/core/view/WindowInsetsCompat;

    .line 655
    invoke-direct {p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method protected onAttachedToWindow()V
    .registers 1

    .line 303
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 304
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Lo/getCreatedOnDateMs;

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    .line 325
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 326
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 308
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 310
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatMediaItem()Lo/PropertyMetadata;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/PropertyMetadata;->write(Ljava/lang/Object;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    .line 289
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    .line 261
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_14

    .line 263
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 264
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 262
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    return-void

    .line 268
    :cond_14
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_23

    const/4 p1, 0x0

    .line 269
    invoke-virtual {p0, p1, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    return-void

    .line 273
    :cond_23
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 274
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setMeasuredDimension(II)V

    .line 275
    iput p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RatingCompat:I

    .line 276
    iput p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 12

    .line 629
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_8

    return v0

    .line 630
    :cond_8
    invoke-static {p2}, Lo/AtomicReferenceDeserializer;->write(F)F

    move-result p1

    invoke-static {p3}, Lo/AtomicReferenceDeserializer;->write(F)F

    move-result p2

    invoke-static {p1, p2}, Lo/ValueInjector;->read(FF)J

    move-result-wide v4

    .line 631
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    invoke-virtual {p1}, Lo/reportBadDefinition;->IconCompatParcelizer()Lo/TopUserCompanion;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;

    const/4 v6, 0x0

    move-object v1, p2

    move v2, p4

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;-><init>(ZLandroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V

    check-cast p2, Lo/MagicModuleSubmissionRequestBody;

    const/4 p0, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, p2, p0}, Lo/setModifiedEndTimestampMs;->AudioAttributesCompatParcelizer(Lo/TopUserCompanion;Lo/CurrentQuery;Lo/getCollegeName;Lo/MagicModuleSubmissionRequestBody;I)Lo/setPassingYear;

    return v0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 7

    .line 642
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_8

    return v0

    .line 643
    :cond_8
    invoke-static {p2}, Lo/AtomicReferenceDeserializer;->write(F)F

    move-result p1

    invoke-static {p3}, Lo/AtomicReferenceDeserializer;->write(F)F

    move-result p2

    invoke-static {p1, p2}, Lo/ValueInjector;->read(FF)J

    move-result-wide p1

    .line 644
    iget-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    invoke-virtual {p3}, Lo/reportBadDefinition;->IconCompatParcelizer()Lo/TopUserCompanion;

    move-result-object p3

    new-instance v1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V

    check-cast v1, Lo/MagicModuleSubmissionRequestBody;

    const/4 p0, 0x3

    invoke-static {p3, v2, v2, v1, p0}, Lo/setModifiedEndTimestampMs;->AudioAttributesCompatParcelizer(Lo/TopUserCompanion;Lo/CurrentQuery;Lo/getCollegeName;Lo/MagicModuleSubmissionRequestBody;I)Lo/setPassingYear;

    return v0
.end method

.method public onRemoveQueueItem()Z
    .registers 1

    .line 234
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isAttachedToWindow()Z

    move-result p0

    return p0
.end method

.method protected onWindowVisibilityChanged(I)V
    .registers 2

    .line 352
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public read()V
    .registers 2

    .line 244
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_e

    .line 245
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onFastForward:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 247
    :cond_e
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onAddQueueItem:Lo/getCreatedOnDateMs;

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public read(Landroid/view/View;IIIII[I)V
    .registers 25

    .line 585
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    move-object/from16 v0, p0

    .line 587
    iget-object v0, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer:Lo/reportBadDefinition;

    .line 588
    invoke-static/range {p2 .. p2}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v1

    invoke-static/range {p3 .. p3}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v2

    .line 789
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    .line 790
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/4 v5, 0x0

    int-to-long v6, v5

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    const/4 v9, -0x1

    int-to-long v10, v9

    const/16 v12, 0x3f

    shr-long v13, v10, v12

    shl-long/2addr v13, v8

    sub-long/2addr v10, v13

    or-long/2addr v6, v10

    and-long/2addr v1, v6

    shl-long/2addr v3, v8

    or-long/2addr v1, v3

    .line 788
    invoke-static {v1, v2}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v1

    .line 589
    invoke-static/range {p4 .. p4}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v3

    invoke-static/range {p5 .. p5}, Lo/AtomicReferenceDeserializer;->RemoteActionCompatParcelizer(I)F

    move-result v4

    .line 793
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    .line 794
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    int-to-long v10, v5

    shl-long/2addr v10, v8

    int-to-long v13, v9

    shr-long v15, v13, v12

    shl-long/2addr v15, v8

    sub-long/2addr v13, v15

    or-long v9, v10, v13

    and-long/2addr v3, v9

    shl-long/2addr v6, v8

    or-long/2addr v3, v6

    .line 792
    invoke-static {v3, v4}, Lo/getReferencedType;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v3

    .line 590
    invoke-static/range {p6 .. p6}, Lo/AtomicReferenceDeserializer;->write(I)I

    move-result v6

    move-object/from16 p0, v0

    move-wide/from16 p1, v1

    move-wide/from16 p3, v3

    move/from16 p5, v6

    .line 587
    invoke-virtual/range {p0 .. p5}, Lo/reportBadDefinition;->read(JJI)J

    move-result-wide v0

    shr-long v2, v0, v8

    long-to-int v2, v2

    .line 798
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 592
    invoke-static {v2}, Lo/JsonPOJOBuilder;->AudioAttributesCompatParcelizer(F)I

    move-result v2

    aput v2, p7, v5

    long-to-int v0, v0

    .line 801
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v1, 0x1

    .line 593
    invoke-static {v0}, Lo/JsonPOJOBuilder;->AudioAttributesCompatParcelizer(F)I

    move-result v0

    aput v0, p7, v1

    return-void
.end method

.method public read(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    .line 569
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaDescriptionCompat:Lo/rootArrayScope;

    invoke-virtual {p0, p3, p4}, Lo/rootArrayScope;->write(II)V

    return-void
.end method

.method protected final read(Lo/getCreatedOnDateMs;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 150
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->handleMediaPlayPauseIfPendingOnHandler:Lo/getCreatedOnDateMs;

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 4

    .line 334
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer:Lo/getAnswerMap;

    if-eqz p0, :cond_f

    if-eqz p2, :cond_b

    invoke-static {p2}, Lo/VersionUtil;->write(Landroid/graphics/Rect;)Lo/WritableTypeIdInclusion;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-interface {p0, p1}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    const/4 p0, 0x1

    return p0
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 4

    .line 298
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lo/getAnswerMap;

    if-eqz v0, :cond_b

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    :cond_b
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final setDensity(Lo/bufferMapProperty;)V
    .registers 3

    .line 166
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Lo/bufferMapProperty;

    if-eq p1, v0, :cond_d

    .line 167
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->density:Lo/bufferMapProperty;

    .line 168
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lo/getAnswerMap;

    if-eqz p0, :cond_d

    invoke-interface {p0, p1}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-void
.end method

.method public final setLifecycleOwner(Lo/hasGetter;)V
    .registers 3

    .line 177
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Lo/hasGetter;

    if-eq p1, v0, :cond_b

    .line 178
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->lifecycleOwner:Lo/hasGetter;

    .line 179
    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Lo/isCreatorVisible;->IconCompatParcelizer(Landroid/view/View;Lo/hasGetter;)V

    :cond_b
    return-void
.end method

.method public final setModifier(Lo/_handleOddName;)V
    .registers 3

    .line 155
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Lo/_handleOddName;

    if-eq p1, v0, :cond_d

    .line 156
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->modifier:Lo/_handleOddName;

    .line 157
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lo/getAnswerMap;

    if-eqz p0, :cond_d

    invoke-interface {p0, p1}, Lo/getAnswerMap;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-void
.end method

.method public final setOnDensityChanged$ui(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-",
            "Lo/bufferMapProperty;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 172
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onDensityChanged:Lo/getAnswerMap;

    return-void
.end method

.method public final setOnModifierChanged$ui(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-",
            "Lo/_handleOddName;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 161
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onModifierChanged:Lo/getAnswerMap;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-",
            "Ljava/lang/Boolean;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 221
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onRequestDisallowInterceptTouchEvent:Lo/getAnswerMap;

    return-void
.end method

.method public final setSavedStateRegistryOwner(Lo/PieChart;)V
    .registers 3

    .line 186
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Lo/PieChart;

    if-eq p1, v0, :cond_b

    .line 187
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->savedStateRegistryOwner:Lo/PieChart;

    .line 188
    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Lo/setCenterTextRadiusPercent;->read(Landroid/view/View;Lo/PieChart;)V

    :cond_b
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public write()V
    .registers 1

    .line 257
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->handleMediaPlayPauseIfPendingOnHandler:Lo/getCreatedOnDateMs;

    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method protected final write(Lo/getCreatedOnDateMs;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getCreatedOnDateMs<",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 147
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onAddQueueItem:Lo/getCreatedOnDateMs;

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1 (androidx.compose.ui.viewinterop.AndroidViewHolder$1)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/bufferMapProperty;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/bufferMapProperty;",
        "p0",
        "",
        "write",
        "(Lo/bufferMapProperty;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $IconCompatParcelizer:Lo/_assertNotNull;


# direct methods
.method constructor <init>(Lo/_assertNotNull;)V
    .registers 2

    .line 443
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;->$IconCompatParcelizer:Lo/_assertNotNull;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 442
    check-cast p1, Lo/bufferMapProperty;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;->write(Lo/bufferMapProperty;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final write(Lo/bufferMapProperty;)V
    .registers 2

    .line 442
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$1;->$IconCompatParcelizer:Lo/_assertNotNull;

    invoke-virtual {p0, p1}, Lo/_assertNotNull;->AudioAttributesCompatParcelizer(Lo/bufferMapProperty;)V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass10 (androidx.compose.ui.viewinterop.AndroidViewHolder$10)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/findSetterInfo;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lo/findSetterInfo;",
        "",
        "AudioAttributesCompatParcelizer",
        "(Lo/findSetterInfo;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

.field final synthetic $write:Lo/_assertNotNull;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 4

    .line 784
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->$write:Lo/_assertNotNull;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/findSetterInfo;)V
    .registers 6

    .line 392
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->$write:Lo/_assertNotNull;

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 783
    invoke-interface {p1}, Lo/findSetterInfo;->read()Lo/findSerializationTyping;

    move-result-object p1

    invoke-interface {p1}, Lo/findSerializationTyping;->IconCompatParcelizer()Lo/JsonParserDelegate;

    move-result-object p1

    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_37

    const/4 v2, 0x1

    .line 394
    invoke-static {v0, v2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Z)V

    .line 395
    invoke-virtual {v1}, Lo/_assertNotNull;->accessensureViewModelStore()Lo/_configureGenerator;

    move-result-object v1

    instance-of v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v2, :cond_29

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_2a

    :cond_29
    const/4 v1, 0x0

    :goto_2a
    if-eqz v1, :cond_33

    .line 397
    invoke-static {p1}, Lo/balloc;->RemoteActionCompatParcelizer(Lo/JsonParserDelegate;)Landroid/graphics/Canvas;

    move-result-object p1

    .line 395
    invoke-virtual {v1, p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V

    :cond_33
    const/4 p0, 0x0

    .line 399
    invoke-static {v0, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Z)V

    :cond_37
    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 391
    check-cast p1, Lo/findSetterInfo;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$10;->AudioAttributesCompatParcelizer(Lo/findSetterInfo;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass11 (androidx.compose.ui.viewinterop.AndroidViewHolder$11)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 150
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 151
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 149
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$11;->AudioAttributesCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass12 (androidx.compose.ui.viewinterop.AndroidViewHolder$12)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "RemoteActionCompatParcelizer",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 2

    .line 784
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()V
    .registers 4

    .line 214
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->write(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Z

    move-result v0

    if-eqz v0, :cond_37

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_37

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    if-ne v0, v1, :cond_37

    .line 215
    invoke-static {v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/PropertyMetadata;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    check-cast v1, Lo/createDummyDeserializationContext;

    invoke-static {}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer()Lo/getAnswerMap;

    move-result-object v2

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi26Parcelizer()Lo/getCreatedOnDateMs;

    move-result-object p0

    .line 783
    invoke-static {v0}, Lo/PropertyMetadata;->IconCompatParcelizer(Lo/PropertyMetadata;)Lo/g0;

    move-result-object v0

    invoke-virtual {v0, v1, v2, p0}, Lo/g0;->IconCompatParcelizer(Ljava/lang/Object;Lo/getAnswerMap;Lo/getCreatedOnDateMs;)V

    :cond_37
    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 209
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$12;->RemoteActionCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass13 (androidx.compose.ui.viewinterop.AndroidViewHolder$13)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 2

    .line 220
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;->IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 219
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;->IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer()Lo/_assertNotNull;

    move-result-object p0

    invoke-virtual {p0}, Lo/_assertNotNull;->ensureViewModelStore()V

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 219
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$13;->AudioAttributesCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass14 (androidx.compose.ui.viewinterop.AndroidViewHolder$14)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "read",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 138
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;->IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 137
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$14;->read()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read()V
    .registers 1

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass15 (androidx.compose.ui.viewinterop.AndroidViewHolder$15)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getCreatedOnDateMs<",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "AudioAttributesCompatParcelizer",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 147
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 148
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public final synthetic invoke()Ljava/lang/Object;
    .registers 1

    .line 146
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$15;->AudioAttributesCompatParcelizer()V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass2 (androidx.compose.ui.viewinterop.AndroidViewHolder$2)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/_configureGenerator;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/_configureGenerator;",
        "p0",
        "",
        "IconCompatParcelizer",
        "(Lo/_configureGenerator;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $read:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

.field final synthetic $write:Lo/_assertNotNull;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V
    .registers 3

    .line 447
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$read:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$write:Lo/_assertNotNull;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/_configureGenerator;)V
    .registers 4

    .line 445
    instance-of v0, p1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v0, :cond_7

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    if-eqz p1, :cond_11

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$read:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$write:Lo/_assertNotNull;

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V

    .line 446
    :cond_11
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$read:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->$read:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    if-eq p1, p0, :cond_26

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_26
    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 444
    check-cast p1, Lo/_configureGenerator;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$2;->IconCompatParcelizer(Lo/_configureGenerator;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass3 (androidx.compose.ui.viewinterop.AndroidViewHolder$3)
.class public final Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "p0",
        "",
        "AudioAttributesCompatParcelizer",
        "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 704
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    .line 705
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method

.method private static final AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 702
    invoke-interface {p0}, Lo/getCreatedOnDateMs;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V
    .registers 1

    .line 703
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;->AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 3

    .line 702
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p0

    new-instance v0, Lo/getReferenced;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplBaseParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/getCreatedOnDateMs;

    move-result-object p1

    invoke-direct {v0, p1}, Lo/getReferenced;-><init>(Lo/getCreatedOnDateMs;)V

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 701
    check-cast p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class kotlin.getReferenced (o.getReferenced)
.class public final synthetic Lo/getReferenced;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic read:Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>(Lo/getCreatedOnDateMs;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getReferenced;->read:Lo/getCreatedOnDateMs;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getReferenced;->read:Lo/getCreatedOnDateMs;

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$3;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass4 (androidx.compose.ui.viewinterop.AndroidViewHolder$4)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/_handleOddName;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/_handleOddName;",
        "p0",
        "",
        "write",
        "(Lo/_handleOddName;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $AudioAttributesCompatParcelizer:Lo/_assertNotNull;

.field final synthetic $IconCompatParcelizer:Lo/_handleOddName;


# direct methods
.method constructor <init>(Lo/_assertNotNull;Lo/_handleOddName;)V
    .registers 3

    .line 440
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;->$AudioAttributesCompatParcelizer:Lo/_assertNotNull;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;->$IconCompatParcelizer:Lo/_handleOddName;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 439
    check-cast p1, Lo/_handleOddName;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;->write(Lo/_handleOddName;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final write(Lo/_handleOddName;)V
    .registers 3

    .line 439
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;->$AudioAttributesCompatParcelizer:Lo/_assertNotNull;

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$4;->$IconCompatParcelizer:Lo/_handleOddName;

    invoke-interface {p1, p0}, Lo/_handleOddName;->AudioAttributesCompatParcelizer(Lo/_handleOddName;)Lo/_handleOddName;

    move-result-object p0

    invoke-virtual {v0, p0}, Lo/_assertNotNull;->read(Lo/_handleOddName;)V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass5 (androidx.compose.ui.viewinterop.AndroidViewHolder$5)
.class public final Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;
.super Lo/NioPathSerializer$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\n\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00082\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;",
        "Lo/NioPathSerializer$read;",
        "Lo/NioPathSerializer;",
        "p0",
        "Lo/NioPathSerializer$RemoteActionCompatParcelizer;",
        "p1",
        "write",
        "(Lo/NioPathSerializer;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;",
        "Landroidx/core/view/WindowInsetsCompat;",
        "",
        "AudioAttributesCompatParcelizer",
        "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 2

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x1

    .line 118
    invoke-direct {p0, p1}, Lo/NioPathSerializer$read;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Lo/NioPathSerializer;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    .line 127
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public final write(Lo/NioPathSerializer;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;
    .registers 3

    .line 122
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$5;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p0, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass6 (androidx.compose.ui.viewinterop.AndroidViewHolder$6)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/isAbstract;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/isAbstract;",
        "p0",
        "",
        "IconCompatParcelizer",
        "(Lo/isAbstract;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

.field final synthetic $write:Lo/_assertNotNull;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V
    .registers 3

    .line 432
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$write:Lo/_assertNotNull;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/isAbstract;)V
    .registers 11

    .line 406
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$write:Lo/_assertNotNull;

    invoke-static {v0, v1}, Lo/AtomicReferenceDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/_assertNotNull;)V

    .line 407
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/_configureGenerator;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    check-cast v1, Landroid/view/View;

    invoke-interface {v0, v1}, Lo/_configureGenerator;->read(Landroid/view/View;)V

    .line 408
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    .line 409
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I

    move-result-object v2

    const/4 v3, 0x1

    aget v2, v2, v3

    .line 410
    iget-object v4, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 411
    iget-object v4, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)J

    move-result-wide v4

    .line 412
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-interface {p1}, Lo/isAbstract;->write()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;J)V

    .line 413
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->RemoteActionCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    if-eqz p1, :cond_83

    .line 416
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v6}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I

    move-result-object v6

    aget v1, v6, v1

    if-ne v0, v1, :cond_6e

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)[I

    move-result-object v0

    aget v0, v0, v3

    if-ne v2, v0, :cond_6e

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplApi21Parcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Lo/getKey;->AudioAttributesCompatParcelizer(JJ)Z

    move-result v0

    if-nez v0, :cond_83

    .line 422
    :cond_6e
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {v0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    .line 423
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatMediaItem()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_83

    .line 424
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 431
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->MediaBrowserCompatItemReceiver()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    :cond_83
    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 403
    check-cast p1, Lo/isAbstract;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$6;->IconCompatParcelizer(Lo/isAbstract;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass7 (androidx.compose.ui.viewinterop.AndroidViewHolder$7)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/getAnswerMap<",
        "-",
        "Lo/WritableTypeIdInclusion;",
        "+",
        "Lo/getShowPopup;",
        ">;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lo/WritableTypeIdInclusion;",
        "",
        "Lo/BringIntoViewRequester;",
        "p0",
        "RemoteActionCompatParcelizer",
        "(Lo/getAnswerMap;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 2

    .line 437
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;->$RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/getAnswerMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getAnswerMap<",
            "-",
            "Lo/WritableTypeIdInclusion;",
            "Lo/getShowPopup;",
            ">;)V"
        }
    .end annotation

    .line 436
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;->$RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/getAnswerMap;)V

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 436
    check-cast p1, Lo/getAnswerMap;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$7;->RemoteActionCompatParcelizer(Lo/getAnswerMap;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass8 (androidx.compose.ui.viewinterop.AndroidViewHolder$8)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/_configureGenerator;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/_configureGenerator;",
        "p0",
        "",
        "read",
        "(Lo/_configureGenerator;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V
    .registers 2

    .line 455
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 448
    check-cast p1, Lo/_configureGenerator;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;->read(Lo/_configureGenerator;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

.method public final read(Lo/_configureGenerator;)V
    .registers 4

    .line 450
    sget-boolean v0, Lo/_verifyNoLeadingZeroes;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 451
    invoke-interface {p1}, Lo/_configureGenerator;->MediaBrowserCompatMediaItem()Lo/nukeSymbols;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/nukeSymbols;->RemoteActionCompatParcelizer(Z)V

    .line 453
    :cond_14
    instance-of v0, p1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v0, :cond_1b

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_1c

    :cond_1b
    const/4 p1, 0x0

    :goto_1c
    if-eqz p1, :cond_23

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    .line 454
    :cond_23
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$8;->$IconCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass9 (androidx.compose.ui.viewinterop.AndroidViewHolder$9)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/getConfigOverride;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lo/getConfigOverride;",
        "",
        "IconCompatParcelizer",
        "(Lo/getConfigOverride;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final read:Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 390
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;->read:Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    .line 391
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/getConfigOverride;)V
    .registers 2

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 389
    check-cast p1, Lo/getConfigOverride;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$9;->IconCompatParcelizer(Lo/getConfigOverride;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.Companion (androidx.compose.ui.viewinterop.AndroidViewHolder$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "",
        "RemoteActionCompatParcelizer",
        "Lo/getAnswerMap;",
        "read"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 700
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 701
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.IconCompatParcelizer (androidx.compose.ui.viewinterop.AndroidViewHolder$IconCompatParcelizer)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;
.super Lo/getMagicModuleStats;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onNestedFling(Landroid/view/View;FFZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/getMagicModuleStats;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/TopUserCompanion;",
        "Lo/SampleVideos<",
        "-",
        "Lo/getShowPopup;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field IconCompatParcelizer:I

.field final synthetic RemoteActionCompatParcelizer:Z

.field final synthetic read:J

.field final synthetic write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "J",
            "Lo/SampleVideos<",
            "-",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;",
            ">;)V"
        }
    .end annotation

    .line 638
    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-wide p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->read:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo/getMagicModuleStats;-><init>(ILo/SampleVideos;)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/TopUserCompanion;",
            "Lo/SampleVideos<",
            "-",
            "Lo/getShowPopup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 641
    invoke-virtual {p0, p1, p2}, Lo/getMonthName;->create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;

    sget-object p1, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lo/SampleVideos<",
            "*>;)",
            "Lo/SampleVideos<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 639
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;

    iget-boolean v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iget-wide v3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->read:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;-><init>(ZLandroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V

    check-cast p1, Lo/SampleVideos;

    return-object p1
.end method

.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 640
    check-cast p1, Lo/TopUserCompanion;

    check-cast p2, Lo/SampleVideos;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Lo/getYear;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 631
    iget v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->IconCompatParcelizer:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    goto :goto_5e

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_1e
    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    .line 632
    iget-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    if-nez p1, :cond_44

    .line 633
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/reportBadDefinition;

    move-result-object v4

    sget-object p1, Lo/UnsupportedTypeDeserializer;->write:Lo/UnsupportedTypeDeserializer$write;

    invoke-virtual {p1}, Lo/UnsupportedTypeDeserializer$write;->write()J

    move-result-wide v5

    iget-wide v7, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->read:J

    move-object v9, p0

    check-cast v9, Lo/SampleVideos;

    iput v3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual/range {v4 .. v9}, Lo/reportBadDefinition;->write(JJLo/SampleVideos;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_5d

    :goto_3e
    check-cast p1, Lo/UnsupportedTypeDeserializer;

    invoke-virtual {p1}, Lo/UnsupportedTypeDeserializer;->RemoteActionCompatParcelizer()J

    goto :goto_63

    .line 635
    :cond_44
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/reportBadDefinition;

    move-result-object v3

    iget-wide v4, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->read:J

    sget-object p1, Lo/UnsupportedTypeDeserializer;->write:Lo/UnsupportedTypeDeserializer$write;

    invoke-virtual {p1}, Lo/UnsupportedTypeDeserializer$write;->write()J

    move-result-wide v6

    move-object v8, p0

    check-cast v8, Lo/SampleVideos;

    iput v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual/range {v3 .. v8}, Lo/reportBadDefinition;->write(JJLo/SampleVideos;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5e

    :cond_5d
    return-object v0

    :cond_5e
    :goto_5e
    check-cast p1, Lo/UnsupportedTypeDeserializer;

    invoke-virtual {p1}, Lo/UnsupportedTypeDeserializer;->RemoteActionCompatParcelizer()J

    .line 637
    :goto_63
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.RemoteActionCompatParcelizer (androidx.compose.ui.viewinterop.AndroidViewHolder$RemoteActionCompatParcelizer)
.class public final Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/withTypeHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;-><init>(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\u0008*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ)\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\t\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0011J)\u0010\t\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\t\u0010\u000fJ)\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;",
        "Lo/withTypeHandler;",
        "Lo/withContentValueHandler;",
        "",
        "Lo/isTypeOrSuperTypeOf;",
        "p0",
        "Lo/PropertyValueAny;",
        "p1",
        "Lo/withHandlersFrom;",
        "AudioAttributesCompatParcelizer",
        "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;",
        "Lo/getValueHandler;",
        "Lo/hasHandlers;",
        "",
        "write",
        "(Lo/getValueHandler;Ljava/util/List;I)I",
        "RemoteActionCompatParcelizer",
        "(I)I",
        "read"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

.field final synthetic read:Lo/_assertNotNull;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V
    .registers 3

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->read:Lo/_assertNotNull;

    .line 458
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(I)I
    .registers 7

    .line 500
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    const/4 v1, 0x0

    .line 501
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 502
    iget-object v3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    invoke-static {v4}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v3, v1, p1, v4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I

    move-result p1

    .line 500
    invoke-virtual {v0, v2, p1}, Landroid/view/View;->measure(II)V

    .line 504
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    return p0
.end method

.method private final write(I)I
    .registers 5

    .line 518
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 519
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I

    move-result p1

    .line 520
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 518
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->measure(II)V

    .line 522
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getValueHandler;Ljava/util/List;I)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getValueHandler;",
            "Ljava/util/List<",
            "+",
            "Lo/hasHandlers;",
            ">;I)I"
        }
    .end annotation

    .line 510
    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->write(I)I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/withContentValueHandler;",
            "Ljava/util/List<",
            "+",
            "Lo/isTypeOrSuperTypeOf;",
            ">;J)",
            "Lo/withHandlersFrom;"
        }
    .end annotation

    .line 463
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-nez p2, :cond_1e

    .line 464
    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatItemReceiver(J)I

    move-result v1

    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatCustomActionResultReceiver(J)I

    move-result v2

    const/4 v3, 0x0

    sget-object p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;

    move-object v4, p0

    check-cast v4, Lo/getAnswerMap;

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lo/withContentValueHandler;->AudioAttributesCompatParcelizer$default(Lo/withContentValueHandler;IILjava/util/Map;Lo/getAnswerMap;ILjava/lang/Object;)Lo/withHandlersFrom;

    move-result-object p0

    return-object p0

    .line 467
    :cond_1e
    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatItemReceiver(J)I

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_32

    .line 468
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatItemReceiver(J)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 470
    :cond_32
    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatCustomActionResultReceiver(J)I

    move-result p2

    if-eqz p2, :cond_45

    .line 471
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatCustomActionResultReceiver(J)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 474
    :cond_45
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 476
    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatItemReceiver(J)I

    move-result v0

    .line 477
    invoke-static {p3, p4}, Lo/PropertyValueAny;->AudioAttributesImplBaseParcelizer(J)I

    move-result v1

    .line 478
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 475
    invoke-static {p2, v0, v1, v2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I

    move-result v0

    .line 480
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 481
    invoke-static {p3, p4}, Lo/PropertyValueAny;->MediaBrowserCompatCustomActionResultReceiver(J)I

    move-result v2

    .line 482
    invoke-static {p3, p4}, Lo/PropertyValueAny;->AudioAttributesImplApi21Parcelizer(J)I

    move-result p3

    .line 483
    iget-object p4, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    invoke-static {p4}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    iget p4, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 480
    invoke-static {v1, v2, p3, p4}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->IconCompatParcelizer(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I

    move-result p3

    .line 474
    invoke-virtual {p2, v0, p3}, Landroid/view/View;->measure(II)V

    .line 486
    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    const/4 v3, 0x0

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;

    iget-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->read:Lo/_assertNotNull;

    invoke-direct {p2, p3, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V

    move-object v4, p2

    check-cast v4, Lo/getAnswerMap;

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lo/withContentValueHandler;->AudioAttributesCompatParcelizer$default(Lo/withContentValueHandler;IILjava/util/Map;Lo/getAnswerMap;ILjava/lang/Object;)Lo/withHandlersFrom;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/getValueHandler;Ljava/util/List;I)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getValueHandler;",
            "Ljava/util/List<",
            "+",
            "Lo/hasHandlers;",
            ">;I)I"
        }
    .end annotation

    .line 497
    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p0

    return p0
.end method

.method public final read(Lo/getValueHandler;Ljava/util/List;I)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getValueHandler;",
            "Ljava/util/List<",
            "+",
            "Lo/hasHandlers;",
            ">;I)I"
        }
    .end annotation

    .line 515
    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->write(I)I

    move-result p0

    return p0
.end method

.method public final write(Lo/getValueHandler;Ljava/util/List;I)I
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/getValueHandler;",
            "Ljava/util/List<",
            "+",
            "Lo/hasHandlers;",
            ">;I)I"
        }
    .end annotation

    .line 492
    invoke-direct {p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)I

    move-result p0

    return p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.RemoteActionCompatParcelizer.AnonymousClass2 (androidx.compose.ui.viewinterop.AndroidViewHolder$RemoteActionCompatParcelizer$2)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/_parser$IconCompatParcelizer;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lo/_parser$IconCompatParcelizer;",
        "",
        "AudioAttributesCompatParcelizer",
        "(Lo/_parser$IconCompatParcelizer;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $AudioAttributesCompatParcelizer:Lo/_assertNotNull;

.field final synthetic $RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lo/_assertNotNull;)V
    .registers 3

    .line 487
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;->$RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;->$AudioAttributesCompatParcelizer:Lo/_assertNotNull;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/_parser$IconCompatParcelizer;)V
    .registers 2

    .line 486
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;->$RemoteActionCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    check-cast p1, Landroid/view/View;

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;->$AudioAttributesCompatParcelizer:Lo/_assertNotNull;

    invoke-static {p1, p0}, Lo/AtomicReferenceDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/_assertNotNull;)V

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 486
    check-cast p1, Lo/_parser$IconCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$2;->AudioAttributesCompatParcelizer(Lo/_parser$IconCompatParcelizer;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.RemoteActionCompatParcelizer.AnonymousClass3 (androidx.compose.ui.viewinterop.AndroidViewHolder$RemoteActionCompatParcelizer$3)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;
.super Lo/MagicModuleUseCase;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/MagicModuleUseCase;",
        "Lo/getAnswerMap<",
        "Lo/_parser$IconCompatParcelizer;",
        "Lo/getShowPopup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lo/_parser$IconCompatParcelizer;",
        "",
        "RemoteActionCompatParcelizer",
        "(Lo/_parser$IconCompatParcelizer;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 465
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;->write:Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    .line 466
    invoke-direct {p0, v0}, Lo/MagicModuleUseCase;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/_parser$IconCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method public final synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 464
    check-cast p1, Lo/_parser$IconCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer$3;->RemoteActionCompatParcelizer(Lo/_parser$IconCompatParcelizer;)V

    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class androidx.compose.ui.viewinterop.AndroidViewHolder.read (androidx.compose.ui.viewinterop.AndroidViewHolder$read)
.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;
.super Lo/getMagicModuleStats;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewHolder;->onNestedPreFling(Landroid/view/View;FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/getMagicModuleStats;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/TopUserCompanion;",
        "Lo/SampleVideos<",
        "-",
        "Lo/getShowPopup;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

.field final synthetic RemoteActionCompatParcelizer:J

.field read:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "J",
            "Lo/SampleVideos<",
            "-",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;",
            ">;)V"
        }
    .end annotation

    .line 645
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iput-wide p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->RemoteActionCompatParcelizer:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo/getMagicModuleStats;-><init>(ILo/SampleVideos;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/TopUserCompanion;",
            "Lo/SampleVideos<",
            "-",
            "Lo/getShowPopup;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 648
    invoke-virtual {p0, p1, p2}, Lo/getMonthName;->create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;

    sget-object p1, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lo/SampleVideos<",
            "*>;)",
            "Lo/SampleVideos<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 646
    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    iget-wide v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->RemoteActionCompatParcelizer:J

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;JLo/SampleVideos;)V

    check-cast p1, Lo/SampleVideos;

    return-object p1
.end method

.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 647
    check-cast p1, Lo/TopUserCompanion;

    check-cast p2, Lo/SampleVideos;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->IconCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Lo/getYear;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 644
    iget v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->read:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->AudioAttributesCompatParcelizer:Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->read(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lo/reportBadDefinition;

    move-result-object p1

    iget-wide v3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->RemoteActionCompatParcelizer:J

    move-object v1, p0

    check-cast v1, Lo/SampleVideos;

    iput v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$read;->read:I

    invoke-virtual {p1, v3, v4, v1}, Lo/reportBadDefinition;->RemoteActionCompatParcelizer(JLo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_2e

    return-object v0

    :cond_2e
    :goto_2e
    sget-object p0, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    return-object p0
.end method

###### Class kotlin.referenceValue (o.referenceValue)
.class public final synthetic Lo/referenceValue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Lo/getCreatedOnDateMs;


# direct methods
.method public synthetic constructor <init>(Lo/getCreatedOnDateMs;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/referenceValue;->write:Lo/getCreatedOnDateMs;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/referenceValue;->write:Lo/getCreatedOnDateMs;

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesCompatParcelizer(Lo/getCreatedOnDateMs;)V

    return-void
.end method
