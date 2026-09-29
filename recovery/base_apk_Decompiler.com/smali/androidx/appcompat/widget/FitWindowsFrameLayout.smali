###### Class androidx.appcompat.widget.FitWindowsFrameLayout (androidx.appcompat.widget.FitWindowsFrameLayout)
.class public Landroidx/appcompat/widget/FitWindowsFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lo/AlertControllerRecycleListView;


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/AlertControllerRecycleListView$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 39
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .registers 2

    .line 56
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method public setOnFitSystemWindowsListener(Lo/AlertControllerRecycleListView$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 48
    iput-object p1, p0, Landroidx/appcompat/widget/FitWindowsFrameLayout;->AudioAttributesCompatParcelizer:Lo/AlertControllerRecycleListView$AudioAttributesCompatParcelizer;

    return-void
.end method
