import 'dart:ui';
import 'package:flutter/material.dart';

void main() => runApp(chooseWidget(window.defaultRouteName));

Widget chooseWidget(String routeName) {
  switch (routeName) {
    case 'route1':
      return MyFlutterView();
    default:
      return Center(
        child: Text("Unknown Route"),
      );
  }
}

class MyFlutterView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Card(
        color: Colors.red,
        shape: RoundedRectangleBorder(),
        child: Center(
          child: Text("My Flutter View:"),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        backgroundColor: Colors.yellow,
        child: Icon(
          Icons.add,
          color: Colors.red,
        ),
      ),
    );
  }
}
